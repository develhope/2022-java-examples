package it.develhope.zoo;

/**
 * This class represents an animal
 */
public class Animal {

    /** Animal name */
    public String name;
    public String type;
    public boolean hasFur;

    /**
     * Creates an animal
     */
    public Animal(){
        System.out.println("A new animal was born");
    }

    /**
     * Creates a new animal with name
     * @param name The name of the animal
     */
    public Animal(String name){
        System.out.println("A new animal was born, it is called " + name);
        this.name = name;
    }


    /**
     * Creates a new animal with name and type
     * @param name The name of the animal
     * @param type The type of the animal
     */
    public Animal(String name, String type){
        System.out.println("A new "+type+" was born, it is called " + name);
        this.type = type;
        this.name = name;
    }

    /**
     * Creates a new animal with fur or not
     * @param hasFur
     */
    public Animal(boolean hasFur){
        System.out.println("A new animal was born, does it has fur? " + hasFur);
        this.hasFur = hasFur;
    }

}
