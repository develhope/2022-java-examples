package it.develhope.polimorfism.entities;

import it.develhope.polimorfism.interfaces.Drinkable;
import it.develhope.polimorfism.interfaces.Food;
import lombok.Data;

@Data
public class Dolphin extends FishAbstract{

    private double speed;

    @Override
    public double eat(Food food) {
        System.out.println("The dolphin is eating " + food.getName());
        return food.getCalories() * 0.87;
    }

    @Override
    public void drink(Drinkable drinkable) {

    }

    @Override
    public double getStrength() {
        return 56;
    }

    @Override
    public void run() {
        System.out.println("The dolphin does not run");
    }
}
