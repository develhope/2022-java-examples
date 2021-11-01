package it.develhope.ifConstruct;

public class Start {

    public static void main(String ...args){

        int number = 41;
        String sky = "blue";


        if(number < 30)  System.out.println("Number is more than 30");
        else if(number  > 50)  System.out.println("Number is less than 10");
        else System.out.println("No condition met");

        String result = number > 40 ? "Number is more than 40" :"Number is less than 40";
        System.out.println(result);

        Animal lion = new Animal(50, "lion");
        Animal zebra = new Animal(50, "zebra");
        Animal penguin = new Animal(50, "penguin");

        lion.eat();
        zebra.eat();
        penguin.eat();



    }
}
