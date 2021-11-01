package it.develhope.mapsAndSets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StartMap {

    public static void main(String ...args){
        Map<String, User> myNewMap = new HashMap<>();
        myNewMap.put("lorenzo@develhope.com", new User("lorenzo@develhope.com", "Lorenzo", "Lorenzo_Dev"));
        myNewMap.put("gloria@develhope.com", new User("gloria@develhope.com", "Gloria", "Gloria_Dev"));

        myNewMap.put("1marco@develhope.com", new User("marco@develhope.com", "Marco", "Marco_Dev"));
        myNewMap.put("2marco@develhope.com", new User("marco@develhope.com", "Marco", "Marco_Dev"));
        myNewMap.put("3marco@develhope.com", new User("marco@develhope.com", "Marco", "Marco_Dev"));
        myNewMap.put("4marco@develhope.com", new User("marco@develhope.com", "Marco", "Marco_Dev"));

        User gloria = myNewMap.get("gloria@develhope.com");

        System.out.println("----------------------------------------");
        myNewMap.forEach((key, value)->{
            System.out.println("The single value is " + key + " - - " + value);
        });

        System.out.println("----------------------------------------");

        myNewMap.remove("lorenzo@develhope.com");
        myNewMap.replace("436marco@develhope.com", new User("marco@develhope.comXX", "MarcoXX", "Marco_DevXX"));

        myNewMap.forEach((key, value)->{
            System.out.println("The single value is " + key + " - - " + value);
        });

        System.out.println("----------------------------------------");

        Set<String> keys = myNewMap.keySet();
        keys.forEach(key->{
            User value = myNewMap.get(key);
            System.out.println("The single value is " + key + " - - " + value);
        });

        System.out.println("----------------------------------------");




    }
}
