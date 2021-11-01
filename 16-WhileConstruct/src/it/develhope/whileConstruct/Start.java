package it.develhope.whileConstruct;

import java.util.Arrays;

public class Start {

    public static void main(String ...args){

        String[] myArrayOfStrings = new String[]{"one", "two", "three"};

        int i = 0;
        while(i < myArrayOfStrings.length){
            System.out.println(i + " - " + myArrayOfStrings[i]);
            i++;
        }

        int a = 2;
        System.out.println("-------------------------------------");
        while (a < 100){
            a = a*2; // a*=2;
            System.out.println("The value of a is " + a );
        }

        a = 2;
        System.out.println("-------------------------------------");
        while (true){ //bad practice
            a = a*2; // a*=2;
            System.out.println("The value of a is " + a );
            if(a > 100) break;
        }

        a = 2;
        System.out.println("-------------------------------------");
        while (a<100) { //bad practice
            a = a*2; // a*=2;
            if(a > 50){
                System.out.println("Not printing but continue");
                continue;
            }
            System.out.println("The value of a is " + a );
        }

        System.out.println("-------------------------------------");

        int index = 10;
        do{
            System.out.println("Index is DO WHILE " + index);
            index++;
        }while(index<5);
        System.out.println("-------------------------------------");
        index = 10;
        while(index<5){
            System.out.println("Index is  WHILE " + index);
            index++;
        }
        System.out.println("-------------------------------------");

    }
}
