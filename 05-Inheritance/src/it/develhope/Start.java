package it.develhope;

import it.develhope.entities.*;

public class Start {

    public static void main(String ...args){
        System.out.println("------- Start the Zoo --------");

        AbstractAnimal animal = new AbstractAnimal() {
            @Override
            public void talk() {

            }

            @Override
            public void drink() {

            }

            @Override
            public void eat() {
                System.out.println("This animal eats all the stuff");
            }
        };
        animal.name = "Zebra";

        Giraffe giraffe = new Giraffe();
        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Eagle eagle = new Eagle();

        System.out.println("Animal Name " + giraffe.type);

        Zookeeper zookeeper = new Zookeeper();

        zookeeper.feedAnimal(giraffe);
        zookeeper.feedAnimal(eagle);
        zookeeper.feedAnimal(lion);
        zookeeper.feedAnimal(penguin);

        zookeeper.talkWithAnimal(giraffe);
        zookeeper.talkWithAnimal(eagle);
        zookeeper.talkWithAnimal(lion);
        zookeeper.talkWithAnimal(penguin);

        zookeeper.makeAnimalFly(eagle);

    }
}
