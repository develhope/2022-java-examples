package it.develhope.arrayAndList;

import it.develhope.arrayAndList.entities.*;

import java.util.Arrays;

public class StartAnimals {

    public static void main(String[] args) {
        Animal leo = new Animal("Leo", "50km/h", false, true);
        Animal zebra = new Animal("Zebra", "25km/h", false, false);
        Animal dolphin = new Animal("Dolphin", "15km/h", false, true);
        Animal eagle = new Animal("Eagle", "150km/h", true, true);
        System.out.println("Name of the eagle is " + eagle.name);

        Animal[] theAnimals = new Animal[]{leo, zebra, dolphin, eagle};

        Animal[] theAnimals2 = new Animal[2];
        theAnimals2[0] = leo;
        theAnimals2[1] = eagle;

        Animal[] theAnimals3 = new Animal[]{
                new Animal("Mouse", "15km/h", false, false),
                zebra,
                eagle
        };

        System.out.println("Lists results");
        System.out.println("The Animals " + Arrays.toString(theAnimals));
        System.out.println("The Animals II" + Arrays.toString(theAnimals2));
        System.out.println("The Animals III" + Arrays.toString(theAnimals3));

        theAnimals3[2].name =  "Aquilotto";
        System.out.println("Name of the eagle is " + eagle.name);
        System.out.println("Lists results");


        Animal arrayOfPolyAnimals[] = new Animal[2];
        arrayOfPolyAnimals[0] = new Leo("Alex");
        arrayOfPolyAnimals[1] = new Zebra("Martin");

        Leo arrayOfLions[] = new Leo[2];
        arrayOfLions[0] = new Leo("Alex II");
        // arrayOfLions[1] = new Zebra("Martin II ");// -- Not permitted
        // arrayOfLions[1] = new Animal("Mouse", "15km/h", false, false); // -- Not permitted

        IAnimal animalsInterface[] = new IAnimal[2];
        animalsInterface[0] = new Leo("Alex I");
        animalsInterface[1] = new Dolphin("Dolphin");

        animalsInterface[0].eat();
    }
}
