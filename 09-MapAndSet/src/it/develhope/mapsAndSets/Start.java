package it.develhope.mapsAndSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Start {

    public static void main(String ...args){
        String[] myStringArray = new String[]{"one", "two", "three"};
        Arrays.stream(myStringArray).forEach(single->{
            System.out.println(single);
        });
        System.out.println("-----------------------------------------------");
        // Set concept
        Set<String> mySet = new HashSet<>();
        mySet.add("pippo");
        mySet.add("pluto");
        mySet.add("paperino");
        mySet.addAll(Arrays.asList("pippo2", "pluto2", "paperino2"));

        Object[] myArray= mySet.toArray();
        Arrays.stream(myArray).forEach(singleElement->{
            System.out.println(singleElement);
        });
        System.out.println("-----------------------------------------------");
        mySet.stream().forEach(singleElement->{
            System.out.println("Single element in array - " + singleElement);
        });
        System.out.println("-----------------------------------------------");
        mySet.stream().filter(singleElement->{
            return singleElement.contains("2");
        }).forEach(singleElement->{
            System.out.println("Single element in array - " + singleElement);
        });

        System.out.println("-----------------------------------------------");
        User lorenzo  = new User("lorenzo@develhope.com", "Lorenzo", "lorenzoDev");
        User lorenzo2 = new User("lorenzo@develhope.com", "Lorenzo", "lorenzoDev");
        User lorenzo3 = new User("lorenzo@develhope.com", "Lorenzo", "lorenzoDev");

        int lorenzoHashcode = lorenzo.hashCode();
        int lorenzo2Hashcode = lorenzo2.hashCode();

        System.out.println("hash codes " + lorenzoHashcode + " - - - "  + lorenzo2Hashcode);

        Set<User> mySetUser = new HashSet<>();
        mySetUser.add(lorenzo);
        mySetUser.add(lorenzo2);
        mySetUser.add(lorenzo3);

        mySetUser.stream().forEach(singleUser->{
            System.out.println("User - " + singleUser + " - User hash code: " + singleUser.hashCode());
        });

        /*mySetUser.forEach(value->{

        });*/



    }
}
