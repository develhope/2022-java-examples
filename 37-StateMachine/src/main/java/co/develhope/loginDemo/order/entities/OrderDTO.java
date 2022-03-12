package co.develhope.loginDemo.order.entities;

import lombok.Data;

@Data
public class OrderDTO {

    private String description;

    private String address;
    private String number;
    private String city;
    private String zipCode;
    private String state;
    private Long restaurant;

    private double totalPrice;
}
