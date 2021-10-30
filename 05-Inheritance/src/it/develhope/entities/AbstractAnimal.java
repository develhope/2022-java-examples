package it.develhope.entities;

public abstract class AbstractAnimal implements IAnimal {

    public String name;
    public String type;
    public String typeOfFood;
    public boolean hasFur;

    public void run(){
        System.out.println("The animal is running");
    }


    public abstract void eat();

}
