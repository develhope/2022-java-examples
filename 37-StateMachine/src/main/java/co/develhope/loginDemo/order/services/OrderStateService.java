package co.develhope.loginDemo.order.services;


import co.develhope.loginDemo.order.entities.Order;
import co.develhope.loginDemo.order.entities.OrderStateEnum;
import co.develhope.loginDemo.order.repositories.OrdersRepository;
import co.develhope.loginDemo.user.entities.User;
import co.develhope.loginDemo.user.services.RiderService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrderStateService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private RiderService riderService;

    public Order setAccept(Order order) throws Exception {
        if(order == null) throw new NullPointerException();
        if(order.getStatus() != OrderStateEnum.CREATED) throw new Exception("Cannot edit order");

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(order.getRestaurant().getId() != user.getId()) throw new Exception("This is not your order");
        // Additional actions (!)

        //Go ahead one step
        order.setStatus(OrderStateEnum.ACCEPTED);
        order.setUpdatedAt(LocalDateTime.now());
        order.setUpdatedBy(user);
        return ordersRepository.save(order);
    }

    public Order setInPreparation(Order order)  throws Exception{
        if(order == null) throw new NullPointerException();
        if(order.getStatus() != OrderStateEnum.ACCEPTED) throw new Exception("Cannot edit order");

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(order.getRestaurant().getId() != user.getId()) throw new Exception("This is not your order");

        //Go ahead one step
        order.setStatus(OrderStateEnum.IN_PREPARATION);
        order.setUpdatedAt(LocalDateTime.now());
        order.setUpdatedBy(user);
        return ordersRepository.save(order);
    }

    public Order setReady(Order order)  throws Exception{
        if(order == null) throw new NullPointerException();
        if(order.getStatus() != OrderStateEnum.IN_PREPARATION) throw new Exception("Cannot edit order");

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(order.getRestaurant().getId() != user.getId()) throw new Exception("This is not your order");

        //Rider Selection
        User rider = riderService.pickRider();
        order.setRider(rider);

        //Go ahead one step
        order.setStatus(OrderStateEnum.READY);
        order.setUpdatedAt(LocalDateTime.now());
        order.setUpdatedBy(user);
        return ordersRepository.save(order);
    }

    public Order setDelivering(Order order)  throws Exception{
        if(order == null) throw new NullPointerException();
        if(order.getStatus() != OrderStateEnum.READY) throw new Exception("Cannot edit order");

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(order.getRider().getId() != user.getId()) throw new Exception("This is not your order");

        //Go ahead one step
        order.setStatus(OrderStateEnum.DELIVERING);
        order.setUpdatedAt(LocalDateTime.now());
        order.setUpdatedBy(user);
        return ordersRepository.save(order);
    }

    public Order setComplete(Order order)  throws Exception{
        if(order == null) throw new NullPointerException();
        if(order.getStatus() != OrderStateEnum.DELIVERING) throw new Exception("Cannot edit order");

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(order.getRider().getId() != user.getId()) throw new Exception("This is not your order");

        //Go ahead one step
        order.setStatus(OrderStateEnum.COMPLETED);
        order.setUpdatedAt(LocalDateTime.now());
        order.setUpdatedBy(user);
        return ordersRepository.save(order);
    }
}
