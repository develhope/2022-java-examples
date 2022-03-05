package co.develhope.fileUploader.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(indexes = {
        @Index(unique = true, name = "email_idx", columnList = "email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    private String profilePicture;
}
