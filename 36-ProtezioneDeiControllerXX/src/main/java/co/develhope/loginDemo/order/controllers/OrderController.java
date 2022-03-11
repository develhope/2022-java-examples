package co.develhope.loginDemo.order.controllers;

import co.develhope.loginDemo.order.entities.Order;
import co.develhope.loginDemo.order.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    //@PreAuthorize("hasRole('USER')")
    //@PreAuthorize("hasAuthority('USER')")
    //@RolesAllowed("USER")
    @Secured("ROLE_USER")
    public ResponseEntity<String> Create(){
        return ResponseEntity.ok("Hello World!");
    }


    @GetMapping("/{id}")
    @PostAuthorize("returnObject.body == null OR returnObject.body.createdBy.id == authentication.principal.id")
    public ResponseEntity<Order> getSingle(@PathVariable Long id){
        try {
            Optional<Order> order = orderRepository.findById(id);
            if (!order.isPresent()) return ResponseEntity.notFound().build();
            return ResponseEntity.ok(order.get());
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
