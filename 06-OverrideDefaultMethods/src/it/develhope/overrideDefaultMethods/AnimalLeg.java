package it.develhope.overrideDefaultMethods;

public class AnimalLeg  implements Cloneable{

    @Override
    public AnimalLeg clone() throws CloneNotSupportedException {
        AnimalLeg clonedAnimalLeg = (AnimalLeg)super.clone();
        return clonedAnimalLeg;
    }
}
