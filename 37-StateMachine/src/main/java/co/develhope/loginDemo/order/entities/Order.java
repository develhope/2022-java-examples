package co.develhope.loginDemo.order.entities;

import co.develhope.loginDemo.user.entities.User;
import co.develhope.loginDemo.utils.entities.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orders")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String description;

    private String address;
    private String number;
    private String city;
    private String zipCode;
    private String state;


    private OrderStateEnum status = OrderStateEnum.CREATED;

    @ManyToOne
    private User restaurant;

    @ManyToOne
    private User rider;

    private double totalPrice;

}
