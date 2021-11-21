package it.develhope.polimorfism.entities;

import it.develhope.polimorfism.interfaces.Animal;

public abstract class FishAbstract implements Animal {

    @Override
    public boolean fightAgainst(Animal animal) {
        if(animal instanceof FishAbstract){
            System.out.println("They can fight");
            return this.getStrength() - animal.getStrength() > 0;
        }else{
            System.out.println("They cannot fight");
            return false;

        }
    }
}
