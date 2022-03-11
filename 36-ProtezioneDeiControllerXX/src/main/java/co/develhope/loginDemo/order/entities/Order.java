package co.develhope.loginDemo.order.entities;

import co.develhope.loginDemo.user.entities.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private User createdBy;

}
