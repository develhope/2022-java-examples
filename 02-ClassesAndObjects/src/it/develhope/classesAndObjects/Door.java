package it.develhope.classesAndObjects;

public class Door {

    public String color;
    public boolean isElectricWindow;
    public boolean isElectricDoor;
    public boolean hasKeyAccess;


    public void print(){
        System.out.println("Door " + color + " - " + isElectricWindow + " - " + isElectricDoor + " - " + hasKeyAccess);
    }

}
