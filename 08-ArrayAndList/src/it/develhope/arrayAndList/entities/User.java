package it.develhope.arrayAndList.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {

    private String firstName;
    private String lastName;
    private String city;

    public User(String[] fields){
        this.firstName = fields[0];
        this.lastName = fields[1];
        this.city = fields[2];
    }
}
