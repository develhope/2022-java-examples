package it.develhope.entities;

public class Penguin extends AbstractAnimal {

    public Penguin(){
        this.type = "Penguin";
    }

    @Override
    public void eat() {
        System.out.println("I am eating fish");
    }

    @Override
    public void talk() {
        System.out.println("Tank Penguin");
    }

    @Override
    public void drink() {
        System.out.println("Drink Penguin");
    }
}
