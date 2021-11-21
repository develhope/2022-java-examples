package it.develhope.polimorfism;

import it.develhope.polimorfism.entities.AnimalAbstract;
import it.develhope.polimorfism.entities.Dolphin;
import it.develhope.polimorfism.entities.Lion;
import it.develhope.polimorfism.entities.Zebra;
import it.develhope.polimorfism.interfaces.Animal;
import it.develhope.polimorfism.interfaces.Food;

import java.util.ArrayList;
import java.util.List;

public class Start {

    static Food genericFood = new Food() {
        @Override
        public double getCalories() {
            return 500;
        }

        @Override
        public double getFatGrams() {
            return 10;
        }

        @Override
        public double getCarbosGrams() {
            return 50;
        }

        @Override
        public double getProteinsGrams() {
            return 100;
        }

        @Override
        public double getVitaminsGrams() {
            return 3;
        }

        @Override
        public String getName() {
            return "Generic food";
        }
    };

    public static void main(String ...args){

        Animal lion = new Lion();
        AnimalAbstract lion1 = new Lion();
        Lion lion2 = new Lion();

        Zebra zebra = new Zebra();
        Animal dolphin = new Dolphin();

        List<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(zebra);
        zoo.add(dolphin);

        System.out.println("Lion VS Zebra, does the lion win?: " + lion.fightAgainst(zebra));
        System.out.println("Dolphin VS Zebra, does the dolphin win?: " + dolphin.fightAgainst(zebra));

        System.out.println("The animals are running");
        zoo.stream().forEach(animal ->{
            animal.run();
        });

        System.out.println("----------------------------------------------");

        double totalCalories = 0;
        for(int i = 0; i<zoo.size(); i++){
            Animal single = zoo.get(i);
            double totalCaloriesAnimal = single.eat(genericFood);
            totalCalories += totalCaloriesAnimal;
        }

        System.out.println("----------------------------------------------");
        System.out.println("All animals have eaten "  +totalCalories + " calories" );
        System.out.println("----------------------------------------------");


    }
}
