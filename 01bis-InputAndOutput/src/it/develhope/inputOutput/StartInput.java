package it.develhope.inputOutput;

import java.util.Scanner;

public class StartInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please set your name: ");
        String name = scanner.nextLine();
        System.out.print("Please set your surname: ");
        String surname = scanner.nextLine();
        System.out.printf("Hello %s %s", name, surname);

        System.out.print("Please set your weight: ");
        double weight = scanner.nextDouble();
        System.out.printf("You are %f kg ", weight);
    }
}
