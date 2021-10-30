package it.develhope.classesAndObjects;

public class Car {

    public String model; //8bit
    public int wheelNumber; // 32bite
    public String color; //8bit
    public boolean isCabrio; // 1bite

    public Door frontDoorLeft;
    public Door frontDoorRight;
    public Door rearDoorLeft;
    public Door rearDoorRight;

    public String print(){
        return isCabrio + " - " + color + " - " + model + " - " + wheelNumber;
    }

}
