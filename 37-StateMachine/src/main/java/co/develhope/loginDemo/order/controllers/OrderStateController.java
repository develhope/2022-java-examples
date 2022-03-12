package co.develhope.loginDemo.order.controllers;

import co.develhope.loginDemo.order.entities.Order;
import co.develhope.loginDemo.order.repositories.OrdersRepository;
import co.develhope.loginDemo.order.services.OrderStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/orders/{id}/state")
public class OrderStateController {

    @Autowired
    private OrderStateService orderStateService;

    @Autowired
    private OrdersRepository ordersRepository;

    @PreAuthorize("hasRole('ROLE_RESTAURANT')")
    @PutMapping("/accepted")
    public ResponseEntity accepted(@PathVariable long id) throws Exception{
        Optional<Order> order = ordersRepository.findById(id);
        if(!order.isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(orderStateService.setAccept(order.get()));

    }

    @PreAuthorize("hasRole('ROLE_RESTAURANT')")
    @PutMapping("/in-preparation")
    public ResponseEntity<Order> inPreparation(@PathVariable long id) throws Exception{
        Optional<Order> order = ordersRepository.findById(id);
        if(!order.isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(orderStateService.setInPreparation(order.get()));
    }

    @PreAuthorize("hasRole('ROLE_RESTAURANT')")
    @PutMapping("/ready")
    public ResponseEntity<Order> ready(@PathVariable long id) throws Exception{
        Optional<Order> order = ordersRepository.findById(id);
        if(!order.isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(orderStateService.setReady(order.get()));
    }

    @PreAuthorize("hasRole('ROLE_RIDER')")
    @PutMapping("/delivering")
    public ResponseEntity<Order> delivering(@PathVariable long id) throws Exception{
        Optional<Order> order = ordersRepository.findById(id);
        if(!order.isPresent()) return ResponseEntity.notFound().build();;
        return ResponseEntity.ok(orderStateService.setDelivering(order.get()));
    }

    @PreAuthorize("hasRole('ROLE_RIDER')")
    @PutMapping("/complete")
    public ResponseEntity<Order> complete(@PathVariable long id) throws Exception{
        Optional<Order> order = ordersRepository.findById(id);
        if(!order.isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(orderStateService.setComplete(order.get()));
    }

}
