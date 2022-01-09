package it.develhope.arrayAndList;

import java.util.Arrays;

public class Start {



    public static void main(String[] args){

        int myList[] = new int[2];

        myList = new int[2];

        myList[0] = 2;
        myList[1] = 42;

        System.out.println("The list is " + Arrays.toString(myList));
        System.out.println("The list is long " + myList.length);

        String myListStirng[] = new String[3];
        double myListDouble[] = new double[3];
        long myListLong[] = new long[3];
        boolean myListBoolean[] = new boolean[3];


        double initDouble[] = new double[]{2.3, 3.4, 32.3, 34.2};
        System.out.println("Double list intializated - length:" + initDouble.length + " elements:" + Arrays.toString(initDouble));
    }
}
