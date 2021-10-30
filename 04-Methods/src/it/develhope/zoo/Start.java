package it.develhope.zoo;

public class Start {

    public static void main(String ...args){
        System.out.println("-----------------------");
        System.out.println("We are creating the ZOO");
        System.out.println("-----------------------");

        Animal giraffe, lion, penguin; // Declaration
        System.out.println("--- Declared two animals");


        giraffe = new Animal("Valentina", "Giraffe"); // Instance - Creation
        lion = new Animal("Leo"); // Instance - Creation
        penguin = new Animal(false); // Instance - Creation

        System.out.println("--- Created two animals");

        //Now I set all the parameters
        giraffe.hasFur = true;
        lion.type = "Lion";
        penguin.name = "Giovanni";
        penguin.type = "Penguin";

        System.out.println("---- Creating the zookeeper");

        Zookeeper marco = new Zookeeper("Marco");
        marco.surname = "rossi";

        //Extracting the complete name
        String marcoCompleteName = Zookeeper.getCompleteName(marco);
        System.out.println("Zookeeper name is " + marcoCompleteName);

        System.out.println("Zookeeper name is " + marco.getCompleteNameV2());


        //Creating food
        Food meat = new Food("T-bone", 500);
        Food green = new Food("Grass", 200);
        Food leaf = new Food("Leaf", 100);

        System.out.println("--- Feeding ---");
        int giraffeCalories = marco.feedAnimal(giraffe, leaf);
        int lionCalories = marco.feedAnimal(lion, meat);
        int penguinCalories = marco.feedAnimal(penguin, green);

        int totalCalories = giraffeCalories + lionCalories + penguinCalories;

        System.out.println("---- All animals are fed with " + totalCalories + " kcal");


    }
}
