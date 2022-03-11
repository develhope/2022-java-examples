package co.develhope.customQueries.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Data
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private UserStatus status = UserStatus.DEACTIVATED;

    @Column(unique = true)
    private String email;

}
