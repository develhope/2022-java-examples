package it.develhope.forConstruct;

import java.util.*;

public class Start {

    public static void main(String ...args){
        String[] myStringArray = new String[]{
                "one", "two", "three", "four"
        };

        System.out.println(" ------------------------------------------- ");
        for(int i = 0; i < myStringArray.length; i+=2){
            String theValue = myStringArray[i];
            System.out.println("The index is " + i + " - " + theValue);
        }
        System.out.println(" ------------------------------------------- ");

        for(int i = myStringArray.length - 1; i>= 0; i--){
            String theValue = myStringArray[i];
            System.out.println("The index is " + i + " - " + theValue);
        }
        System.out.println(" ------------------------------------------- ");

        Animal zebra = new Animal("zebra",15);
        Animal lion = new Animal("lion",10);
        Animal penguin = new Animal("penguin",5);

        Animal[] animalArray = new Animal[]{zebra, lion, penguin};
        System.out.println(" ------------------------------------------- ");
        boolean isThereALion = false;
        for (int i = 0; i < animalArray.length; i++) {
            Animal singleValue = animalArray[i];
            System.out.println("Index is " + i);
            if(singleValue.type.equals("lion")){
                isThereALion = true;
                break;
            };
        }
        System.out.println("Is there at least a lion? " + isThereALion);

        System.out.println(" ------------------------------------------- ");
        for (int i = 0; i < animalArray.length; i++) {
            Animal singleValue = animalArray[i];
            System.out.println("Index is " + i);
            if(singleValue.type.equals("lion")){
                System.out.println("I am stopping current cycle, it is a lion");
                continue;
            }
            System.out.println("Value is " + singleValue);
        }

        //For with a list
        System.out.println(" ------------------------------------------- ");
        List<Animal> animalList = new ArrayList<>();
        animalList.add(lion);
        animalList.add(zebra);
        animalList.add(penguin);

        for (int i = 0; i < animalList.size(); i++) {
            Animal singleValue = animalList.get(i);
            System.out.println("The single animal is " + singleValue);
        }

        System.out.println(" ------------------------------------------- ");

        for (int i = animalList.size()-1; i>=0; i--){
            Animal singleValue = animalList.get(i);
            if(singleValue.type.equals("lion")){
                animalList.remove(i);
            };
        }
        /* Bad practice
        System.out.println("Animals are " + animalList.get(0));
        System.out.println("Animals are " + animalList.get(1));
        */

        animalList.stream().forEach(singleAnimal ->{
            System.out.println("Animal is " + singleAnimal);
        });

        System.out.println(" ------------------------------------------- ");
        for (Animal animal: animalList) {
            System.out.println("The single animal is " + animal);
        }

        System.out.println(" ------------------------------------------- ");

        for (Animal animal: animalArray) {
            System.out.println("The single animal is " + animal);
        }
        System.out.println(" ------------------------------------------- ");

        Map<String, Animal> map = new HashMap<>();
        map.put("lion", lion);
        map.put("penguin", penguin);
        map.put("zebra", zebra);

        // Not optimized
        Object[] mapArray = map.values().toArray();
        for (int i = 0; i<mapArray.length; i++){
            Animal singleValue = (Animal) mapArray[i];
            System.out.println("The single animal form map is " + singleValue);
        }
        System.out.println(" ------------------------------------------- ");

        for (Animal singleValue: map.values()) {
            System.out.println("The single animal form map in foreach is " + singleValue);
        }

        System.out.println(" ------------------------------------------- ");

        Set<Animal> myAnimalSet = new HashSet<>();
        myAnimalSet.add(lion);
        myAnimalSet.add(penguin);
        myAnimalSet.add(zebra);

        Object[] myAnimalArrayFromSet = myAnimalSet.toArray();
        for (int i = 0; i < myAnimalArrayFromSet.length; i++) {
            Animal singleValue = (Animal) myAnimalArrayFromSet[i];
            System.out.println("The single animal form set in for is " + singleValue);
        }

        System.out.println(" ------------------------------------------- ");

        for (Animal singleValue: myAnimalSet) {
            System.out.println("The single animal form set in foreach is " + singleValue);
        }

        System.out.println(" ------------------------------------------- ");

        String[][] myStringArray2d = new String[][]{
                new String[] {"one", "two", "three", "four"},
                new String[] {"1", "2", "3", "4"},
                new String[] {"A", "B", "C"},
        };

        for(int i = 0; i < myStringArray2d.length;i++){
            String[] singleValue = myStringArray2d[i];
            System.out.println("Array 2D - Single value" + singleValue);
            for (int j = 0; j < singleValue.length; j++) {
                String singleSingleValue = singleValue[j];
                System.out.println("Array 2D - Stirng[i][j] - Value: " + singleSingleValue + " indexI: " +i + " indexJ: " + j );
            }
        }

        System.out.println(" List in object ");


        Animal superZebra = new Animal("zebra",15, Arrays.asList("grass", "leaf"));
        Animal superLion = new Animal("lion",10, Arrays.asList("meat", "pork", "zebra"));
        Animal superPenguin = new Animal("penguin",5);
        List<Animal> superAnimals = Arrays.asList(superZebra, superLion, superPenguin);
        System.out.println(" ------------------------------------------- ");
        for (int i = 0; i <superAnimals.size(); i++) {
            Animal singleValue = superAnimals.get(i);
            if (singleValue.favouriteFood != null)  for (int j = 0; j <singleValue.favouriteFood.size(); j++) {
                System.out.println("Printing favourite foods for " + singleValue.type + " - " + singleValue.favouriteFood.get(j));
            }
        }
        System.out.println(" ------------------------------------------- ");
        for (Animal animal:  superAnimals) {
            if (animal.favouriteFood != null) for (String food : animal.favouriteFood) {
                System.out.println("Printing favourite foods for " + animal.type + " - " + food);
            }
        }
        System.out.println(" ------------------------------------------- ");

        superAnimals.stream().forEach(singleAnimal->{
            if (singleAnimal.favouriteFood != null) singleAnimal.favouriteFood.stream().forEach(singleFood ->{
                System.out.println("Printing favourite foods for " + singleAnimal.type + " - " + singleFood);
            });
        });

        System.out.println(" ------------------------------------------- ");

    }

}
