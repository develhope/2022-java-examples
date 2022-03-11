package co.develhope.loginDemo.order.controllers;

import co.develhope.loginDemo.order.entities.Order;
import co.develhope.loginDemo.order.repositories.OrdersRepository;
import co.develhope.loginDemo.order.services.OrderService;
import co.develhope.loginDemo.user.entities.User;
import co.develhope.loginDemo.user.utils.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
@PreAuthorize("hasRole('"+ Roles.REGISTERED +"') OR hasRole('"+Roles.ADMIN+"')" )
public class OrderController {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody Order order){
        return ResponseEntity.ok(orderService.save(order));
    }

    @GetMapping("/{id}")
    @PostAuthorize("hasRole('"+ Roles.ADMIN +"') OR returnObject.body == null OR returnObject.body.createdBy.id == authentication.principal.id")
    public ResponseEntity<Order> getSingle(@PathVariable Long id){
        Optional<Order> order = ordersRepository.findById(id);
        if(!order.isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(order.get());
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAll(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        boolean isAdmin =  user.getRoles().stream().filter(role -> role.getName().equals(Roles.ADMIN)).findAny().isPresent();
        if(isAdmin){
            return ResponseEntity.ok(ordersRepository.findAll());
        }else {
            return ResponseEntity.ok(ordersRepository.findByCreatedBy(user));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> update(@RequestBody Order order, @PathVariable Long id){
        if(!orderService.canEdit(id)){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
        return ResponseEntity.ok(orderService.update(id, order));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        if(!orderService.canEdit(id)){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
        ordersRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
