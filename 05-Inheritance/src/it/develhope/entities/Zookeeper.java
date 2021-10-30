package it.develhope.entities;

public class Zookeeper {

    String name;

    public void feedAnimal(AbstractAnimal animal){
        System.out.println("I am feeding the animal " + animal.type);
        animal.eat();
    }

    public void talkWithAnimal(IAnimal animal){
        animal.talk();
    }

    public void giveWaterToAnimal(IAnimal animal){
        animal.drink();
    }

    public void makeAnimalFly(IAnimalWhoFlies animal){
        animal.fly();
    }
}
