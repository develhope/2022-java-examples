package it.develhope.forConstruct;

import java.util.List;

public class Animal {

    public String type;
    public int age;
    public List<String> favouriteFood;

    public Animal(String type, int age){
        this(type, age, null);
    }

    public Animal(String type, int age, List<String> favouriteFood){
        this.type = type;
        this.age = age;
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
