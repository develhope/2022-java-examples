package co.develhope.loginDemo.user.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String name;

    private String description;

    /*@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLES",
            inverseJoinColumns = {
                    @JoinColumn(name = "USER_ID")
            },
            joinColumns = {
                    @JoinColumn(name = "ROLE_ID") })
    private Set<User> user;*/
}
