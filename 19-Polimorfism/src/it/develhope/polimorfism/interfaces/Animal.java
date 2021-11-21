package it.develhope.polimorfism.interfaces;

public interface Animal {

    double eat(Food food);

    void drink(Drinkable drinkable);

    void run();

    double getStrength();

    boolean fightAgainst(Animal animal);

}
