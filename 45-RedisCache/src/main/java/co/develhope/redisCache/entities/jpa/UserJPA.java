package co.develhope.redisCache.entities.jpa;

import co.develhope.redisCache.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class UserJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String firstName;
    private String lastName;
    private String profilePicture;
    private String email;
    private String passwordEncrypted;

    private String domicileAddress;
    private String domicileCity;
    private String domicileNumber;
    private String domicileState;

    private String fiscalCode;

}
