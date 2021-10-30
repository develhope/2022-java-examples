package it.develhope.overrideDefaultMethods;

import java.util.Objects;

public class Animal implements Cloneable {

    public String name;
    public String type;
    public AnimalLeg leftLeg = new AnimalLeg();
    public AnimalLeg rightLeg = new AnimalLeg();

    @Override
    public String toString() {
        return "Animal: " + type + " - " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(this.name, animal.name) && Objects.equals(this.type, animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        Animal clonedAnimal = (Animal)super.clone();
        clonedAnimal.leftLeg = this.leftLeg.clone();
        clonedAnimal.rightLeg = this.rightLeg.clone();
        return clonedAnimal;
    }
}
