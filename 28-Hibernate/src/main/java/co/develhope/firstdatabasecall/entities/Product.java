package co.develhope.firstdatabasecall.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Product extends  BaseEntityData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String description;
    private Double height;
    private Double width;
    private Double length;
}
