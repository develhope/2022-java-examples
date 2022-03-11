package co.develhope.loginDemo.order.services;

import co.develhope.loginDemo.order.entities.Order;
import co.develhope.loginDemo.order.repositories.OrdersRepository;
import co.develhope.loginDemo.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrdersRepository orderRepository;

    public Order save(Order orderInput){
        if(orderInput == null) return null;
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        orderInput.setId(null);
        orderInput.setCreatedAt(LocalDateTime.now());
        orderInput.setCreatedBy(user);
        return orderRepository.save(orderInput);
    }

    public Order update(Long id, Order orderInput){
        if(orderInput == null) return null;
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        orderInput.setId(id);
        orderInput.setUpdatedAt(LocalDateTime.now());
        orderInput.setUpdatedBy(user);
        return orderRepository.save(orderInput);
    }

    public boolean canEdit(Long id) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Optional<Order> order = orderRepository.findById(id);
        if(!order.isPresent()) return false;
        return order.get().getCreatedBy().getId() == user.getId();
    }
}
