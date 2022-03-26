public class Start {

    public static void main(String[] args) {
        System.out.println("Hello -----------------------------");

        int myNewInteger;
        myNewInteger = 5;

        int myNewIntegerArray[];
        myNewIntegerArray = new int[5];

        double myArrayDouble[] = new double[2];
        float myArrayFloat[] = new float[2];
        byte myArrayOfBytes[] = new byte[3];
        long myArrayLong[] = new long[3];
        boolean myArrayBoolean[] = new boolean[4];

        String myStringArray[] = new String[2];

        System.out.println("I will print my first array " + myNewIntegerArray[0]);
        System.out.println("I will print my first array " + myNewIntegerArray[1]);
        System.out.println("I will print my first array " + myNewIntegerArray[2]);
        System.out.println("I will print my first array " + myNewIntegerArray[3]);
        System.out.println("I will print my first array " + myNewIntegerArray[4]);

        System.out.println("----------------- Setting values");
        myNewIntegerArray[0]  = 8;
        myNewIntegerArray[1]  = 5;
        myNewIntegerArray[2]  = 7;
        myNewIntegerArray[3]  = 9;
        myNewIntegerArray[4]  = 1;

        //First index = 0
        //Last index = array.length -1

        System.out.println("Array size is " + myNewIntegerArray.length);
        System.out.println("First element is " + myNewIntegerArray[0]);
        System.out.println("last element is " + myNewIntegerArray[myNewIntegerArray.length-1]);

        System.out.println("0 - I will print my first array " + myNewIntegerArray[0]);
        System.out.println("1 - I will print my first array " + myNewIntegerArray[1]);
        System.out.println("2 - I will print my first array " + myNewIntegerArray[2]);
        System.out.println("3 - I will print my first array " + myNewIntegerArray[3]);
        System.out.println("4 - I will print my first array " + myNewIntegerArray[4]);

        System.out.println("-------------------------------");

        myNewIntegerArray[0]  = 9;
        myNewIntegerArray[1]  = 3;
        myNewIntegerArray[2]  = 1;
        myNewIntegerArray[3]  = 2;
        myNewIntegerArray[4]  = 9;

        System.out.println("0 - I will print my first array " + myNewIntegerArray[0]);
        System.out.println("1 - I will print my first array " + myNewIntegerArray[1]);
        System.out.println("2 - I will print my first array " + myNewIntegerArray[2]);
        System.out.println("3 - I will print my first array " + myNewIntegerArray[3]);
        System.out.println("4 - I will print my first array " + myNewIntegerArray[4]);

        System.out.println("-------------------------------");

        String myArraySmart[] = new String[]{ "Lorenzo", "De Francesco", "Pippo", "Pluto", "Paperino" };

        System.out.println("0 - I will print myArraySmart " + myArraySmart[0]);
        System.out.println("1 - I will print myArraySmart " + myArraySmart[1]);
        System.out.println("2 - I will print myArraySmart " + myArraySmart[2]);
        System.out.println("3 - I will print myArraySmart " + myArraySmart[3]);
        System.out.println("4 - I will print myArraySmart " + myArraySmart[4]);
        
        System.out.println("Bye -------------------------------");
    }
}
