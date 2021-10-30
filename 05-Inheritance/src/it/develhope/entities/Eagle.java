package it.develhope.entities;

public class Eagle extends AbstractAnimal implements IAnimalWhoFlies, IAnimalWhoEats {
    @Override
    public void eat() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void fly() {
        System.out.println("Eagle - I am flying");
    }
}
