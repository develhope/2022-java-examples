package it.develhope.finalModifier;

import lombok.Data;

@Data
public class User {

    final private String id;
    private String name;
    private String surname;
    private int age;

    public User(String id){
        this.id = id;
    }

    public User(){
        this("48-79");
    }
}
