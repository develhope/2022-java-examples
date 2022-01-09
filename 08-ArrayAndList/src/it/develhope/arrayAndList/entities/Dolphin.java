package it.develhope.arrayAndList.entities;

import lombok.ToString;

@ToString
public class Dolphin extends Animal{


    public Dolphin(String name) {
        super(name, "20kmph", false, true);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin is eating");
    }
}
