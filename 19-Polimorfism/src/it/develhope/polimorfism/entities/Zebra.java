package it.develhope.polimorfism.entities;

import it.develhope.polimorfism.interfaces.Food;
import lombok.Data;

@Data
public class Zebra extends AnimalAbstract{

    private int numberOfStrings;

    @Override
    public double eat(Food food) {
        this.printFood(food);
        return food.getCalories() * 0.34;
    }

    @Override
    public double getStrength() {
        return 30;
    }

    @Override
    public void run() {
        System.out.println("The zebra is running");
    }
}
