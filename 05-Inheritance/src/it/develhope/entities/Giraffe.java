package it.develhope.entities;

public class Giraffe extends AbstractAnimal {

    public Giraffe(){
        this.type = "Giraffe";
    }

    @Override
    public void eat() {
        System.out.println("I am eating leaf");
    }

    @Override
    public void talk() {

    }

    @Override
    public void drink() {

    }
}
