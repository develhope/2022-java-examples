package it.develhope.switchConstruct;

import java.util.HashSet;
import java.util.Set;

public class Start {

    public static void main(String ...args){
        int number = 5;

        switch (number){
            case 1 :
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("The number is five or six or seven");
                break;
            default :
                System.out.println("The number is " + number);
                break;
        }

        System.out.println("--------------------------------------------");

        String name = "luigi";
        switch (name){
            case "lorenzo" :
                System.out.println("The name is lorenzo");
                break;
            case "gianni":
                System.out.println("The name is gianni");
                break;
            case "marco":
            case "luigi":
            case "pietro":
                System.out.println("The name is marco, luigi o pietro");
                break;
            default :
                System.out.println("The name is " + name);
                break;
        }

        System.out.println("--------------------------------------------");
        Set<String> names = new HashSet<>();
        names.add("marco");
        names.add("luigi");
        names.add("pietro");

        if(name == "lorenzo"){
            System.out.println("The name is lorenzo");
        }else if(name == "gianni"){
            System.out.println("The name is gianni");
        }else if(names.contains(name)){
            System.out.println("The name is marco, luigi o pietro");
        }else{
            System.out.println("The name is " + name);
        }
        System.out.println("--------------------------------------------");

        User lorenzo = new User("lorenzo",UserTypeEnum.REGISTERED);
        if(lorenzo != null && lorenzo.type != null) {
            switch (lorenzo.type) {
                case ADMIN:
                    System.out.println("User is an admin");
                    break;
                case EDITOR:
                    System.out.println("User is an editor");
                    break;
                case REGISTERED:
                    System.out.println("User is an registered");
                    break;
                default:
                    System.out.println("User is not in one of the types");
                    break;
            }
        }else{
            System.out.println("No user is there");
        }

        System.out.println("--------------------------------------------");

       if(lorenzo.name == "lorenzo"){
            System.out.println("User is lorenzo");
        }else if(lorenzo.type == UserTypeEnum.EDITOR){
            System.out.println("User is editor");
        }else if(lorenzo.name.contains("r")){
            System.out.println("User name contains r");
        }else{
            System.out.println("User default case");
        }


    }
}
