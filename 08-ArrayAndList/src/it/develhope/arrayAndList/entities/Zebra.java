package it.develhope.arrayAndList.entities;

import lombok.ToString;

@ToString
public class Zebra extends Animal{


    public Zebra(String name) {
        super(name, "20kmph", false, false);
    }

    @Override
    public void eat() {
        System.out.println("Zebra is eating");
    }
}
