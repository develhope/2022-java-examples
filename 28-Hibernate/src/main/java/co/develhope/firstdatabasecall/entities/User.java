package co.develhope.firstdatabasecall.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends  BaseEntityData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;

    @Column(unique = true, name = "userEmail", length = 100)
    private String email;

    private Integer age;
    private String city;
    private String placeOfBirth;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Order> orders;
}
