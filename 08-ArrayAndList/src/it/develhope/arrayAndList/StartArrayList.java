package it.develhope.arrayAndList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StartArrayList {

    public static void main(String ...args){
        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");

        Animal animalLion = new Lion();
        List<Animal> myListOfAnimals = new ArrayList<>();

        myListOfAnimals.add(animalLion);
        myListOfAnimals.add(new Zebra());
        myListOfAnimals.add(new Lion());
        myListOfAnimals.add(new Zebra());

        List<Animal> myListOfAnimals2 = new ArrayList<>();
        myListOfAnimals2.add(new Penguin());
        myListOfAnimals2.add(new Penguin());


        Animal firstOfanimals = myListOfAnimals.get(0);
        Animal lastOfanimals  = myListOfAnimals.get(myListOfAnimals.size()-1);

        //myListOfAnimals.add(2, new Lion());
        //myListOfAnimals.set(2, new Lion());
        myListOfAnimals.addAll(myListOfAnimals2);
        myListOfAnimals.addAll(2, myListOfAnimals2);

        List aNewList = new ArrayList();
        aNewList.addAll(Arrays.asList(new String[] {"a", "b", "c"}));


        List<String> nations = new ArrayList<>();
        nations.add("USA");
        nations.add("Italy");
        nations.add("France");
        nations.add("UK");


        System.out.println("-----------------------------");
        nations.stream().forEach(singleElementList -> {
            System.out.println(singleElementList);
        });
        System.out.println("-----------------------------");

        nations.stream().map(singleElementList -> {
            return "--" + singleElementList + "--";
        }).filter(singleElementList -> {
            return !singleElementList.equals("--Italy--") ;
        }).forEach(singleElementList -> {
            System.out.println(singleElementList);
        });
        System.out.println("-----------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(0);

        System.out.println("----------------------------- TakeWhile vS filter");
        numbers.stream().takeWhile(singleElement -> {
            return singleElement <3;
        }).forEach(singleElementList -> {
            System.out.println(singleElementList);
        });
        System.out.println("-----------------------------");
        numbers.stream().filter(singleElement -> {
            return singleElement <3;
        }).forEach(singleElementList -> {
            System.out.println(singleElementList);
        });
        System.out.println("-----------------------------");

        boolean allMatchnumber = numbers.stream().allMatch(singleElement -> {
            return singleElement <3;
        });

        boolean anyMatchnumber =  numbers.stream().anyMatch(singleElement -> {
            return singleElement <3;
        });

        //numbers.stream().filter().map().takeWhile().dropWhile().toList();

        System.out.println("ALL vs ANY" + allMatchnumber + " - ANY:" + anyMatchnumber);

        //myListOfAnimals.remove(animalLion);

        System.out.println("End");

    }
}
