package it.develhope.arrayAndList.entities;

import lombok.ToString;

@ToString
public class Leo extends Animal{

    public Leo(String name) {
        super(name, "30kmph", false, true);
    }

    @Override
    public void eat() {
        System.out.println("Leo is eating");
    }

    public void run(){
        System.out.println("The lion is running");
    }
}
