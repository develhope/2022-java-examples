package it.develhope.arrayAndList.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Animal implements IAnimal {

    public String name;
    public String speed;
    public boolean canFly;
    public boolean canSwim;
    @Setter
    @Getter
    private int age;

    public Animal(String name, String speed, boolean canFly, boolean canSwim){
        this.name = name;
        this.speed = speed;
        this.canFly = canFly ;
        this.canSwim = canSwim;
    }

    @Override
    public void eat() {
        System.out.println("The animal is eating");
    }

}
