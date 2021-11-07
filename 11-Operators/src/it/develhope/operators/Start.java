package it.develhope.operators;

public class Start {

    public static void main (String ...args){

        int varA = 10;
        System.out.println("Var A " + varA);
        System.out.println("Var A " + varA++);
        //Var a = 11
        System.out.println("Var A " + ++varA);

        int varB = 10;
        System.out.println("Var B " + varB);
        System.out.println("Var B " + varB--);
        //Var a = 9
        System.out.println("Var B " + --varB);

        int a = 2;
        int b = 5;

        System.out.println("Result b/a " + (b/a));
        System.out.println("Rest b%a " + (b%a));

        //----------------------------------
        System.out.println("Rest b=b*3= " + (b*=3));
        System.out.println("Rest b=b/3= " + (b/=3));
        System.out.println("Rest b=b%3= " + (b%=3));


        System.out.println("Start");
    }
}
