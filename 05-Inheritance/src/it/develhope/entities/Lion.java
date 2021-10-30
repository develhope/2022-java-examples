package it.develhope.entities;

public class Lion  extends AbstractAnimal {

    public Lion(){
        this.type = "Lion";
    }

    @Override
    public void eat() {
        System.out.println("I am eating meat");
    }

    @Override
    public void talk() {
        System.out.println("Roarrrrr");
    }

    @Override
    public void drink() {
        System.out.println("Lion drinking");
    }
}
