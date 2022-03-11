package co.develhope.loginDemo.auth.entities;

import lombok.Data;

@Data
public class SignupDTO {

    /** User name */
    private String name;
    /** User surname */
    private String surname;

    /** User email */
    private String email;
    /** User password clear */
    private String password;
}
