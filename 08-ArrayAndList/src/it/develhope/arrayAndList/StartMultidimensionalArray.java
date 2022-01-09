package it.develhope.arrayAndList;

import it.develhope.arrayAndList.entities.User;

import java.util.Arrays;

public class StartMultidimensionalArray {

    public static void main(String[] args) {

        //String arrayMultidimensional[][][] = new String[2][3][3];

        String arrayMultidimensional[][] = new String[][]{
                {"Lorenzo", "De Francesco", "Milano"},
                {"Gloria", "Verdi", "Roma"},
                {"Paolo", "Rossi", "Trieste"},
        };

        String cityOfGloria = arrayMultidimensional[1][2];


        User[] users = new User[]{
                new User("Lorenzo", "De Francesco", "Milano"),
                new User(arrayMultidimensional[1]),
                new User("Paolo", "Rossi", "Trieste"),
        };

        String cityOfGloriaObject = users[1].getCity();

        String arrayMultidimensionalII[][] =  new String[2][5];

        arrayMultidimensionalII[0][0] = "asdasd";
        arrayMultidimensionalII[0][1] = "12345";
        /*arrayMultidimensionalII[0][2] = "12345";
        arrayMultidimensionalII[0][3] = "12345";
        arrayMultidimensionalII[0][4] = "12345";*/

        arrayMultidimensionalII[1][0] = "asdasd";
        arrayMultidimensionalII[1][1] = "12345";
        //arrayMultidimensionalII[1][2] = "12345";
        arrayMultidimensionalII[1][3] = "12345";
        arrayMultidimensionalII[1][4] = "12345";



        System.out.println(Arrays.toString(arrayMultidimensional));
    }
}
