package it.develhope.classesAndObjects;

public class Preferences {

    private static Preferences preferences = new Preferences();

    public int maxPlacesInGarage = 100;
    public String garageName = "My garage";

    private Preferences(){}

    public static Preferences getInstance(){
        return preferences;
    }
}
