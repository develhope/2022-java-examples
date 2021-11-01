package it.develhope.arrayAndList;

import java.util.Arrays;

public class Start {

    public static void main(String ...args){

        String[] myStringArray = new String[3];
        myStringArray[0] = "Pippo";
        myStringArray[1] = "Pluto";
        myStringArray[2] = "Paperino";

        System.out.println("String array " +  myStringArray[0]);
        System.out.println("String array " +  myStringArray[1]);
        System.out.println("String array " +  myStringArray[2]);
        System.out.println("Length of strings " +  myStringArray.length);

        Animal[] animals  = new Animal[4];
        animals[0] = new Zebra();
        animals[1] = new Lion();
        animals[2] = new Lion();
        animals[3] = new Lion();

        Animal[] animalsCloned  = animals.clone();

        System.out.println("Length of animals " +  animals.length);
        System.out.println("First animal " +  animals[0]);
        System.out.println("Last animal " +  animals[animals.length-1]);

        String[] myStringArrayOfNumbersInLetter = new String[]{
                "one", "two", "three"
        };

        String[] myStringArrayOfNumbersInLetterCloned =  myStringArrayOfNumbersInLetter.clone();

        System.out.println("End ");

        //Zebra[] zebras  = new Zebra[2];
        //zebras[0] = new Zebra();
        //zebras[1] = new Lion();



    }
}
