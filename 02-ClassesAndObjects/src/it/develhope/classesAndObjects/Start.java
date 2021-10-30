package it.develhope.classesAndObjects;

public class Start {
   
    public static void main(String args[]){

        Preferences preferences = Preferences.getInstance();
        System.out.println("--- " + preferences.maxPlacesInGarage + " ---");
        System.out.println("--- " + preferences.garageName+ " ---");

        preferences.garageName = "My super garage";

        Preferences preferences2 = Preferences.getInstance();
        System.out.println("---2- " + preferences2.maxPlacesInGarage + "-2---");
        System.out.println("---2- " + preferences2.garageName+ "-2---");

        Preferences preferences3 = Preferences.getInstance();
        System.out.println("---3- " + preferences3.maxPlacesInGarage + "-3---");
        System.out.println("---3- " + preferences3.garageName+ "-3---");

        /*System.out.println("Start - main");

        System.out.println("Max places in my garage " + Garage.maxPlaces);

        Car mini = new Car();
        mini.isCabrio = false;
        mini.model = "MINI COOPER D";
        mini.wheelNumber = 4;
        mini.color = "Grey";

        Door door1 = new Door();
        door1.isElectricDoor = true;
        door1.color = "red";
        door1.hasKeyAccess = true;
        door1.isElectricWindow = true;

        Door door2 = new Door();
        door2.isElectricDoor = true;
        door2.color = "blue";
        door2.hasKeyAccess = true;
        door2.isElectricWindow = true;

        Door door3 = new Door();
        door3.isElectricDoor = true;
        door3.color = "red";
        door3.hasKeyAccess = true;
        door3.isElectricWindow = true;

        Door door4 = new Door();
        door4.isElectricDoor = true;
        door4.color = "red";
        door4.hasKeyAccess = true;
        door4.isElectricWindow = true;*/



        //door3.color = "blue";
        //mini.rearDoorRight.color = "blue";

       /* System.out.println("-----------------------------------------------");
        System.out.println("Mini " + mini.print());
        mini.frontDoorLeft.print();
        mini.frontDoorRight.print();
        mini.rearDoorLeft.print();
        mini.rearDoorRight.print();
        System.out.println("-----------------------------------------------");*/

        /* Car audi = new Car();
        audi.wheelNumber = 4;
        audi.model = "A3";
        audi.color = "black";
        audi.isCabrio = true;*/

        //System.out.println("Mini " + mini.print());
        //System.out.println("Audi " + audi.print());

        //System.out.println("Mini " + mini.isCabrio + " - " + mini.color + " - " + mini.model + " - " + mini.wheelNumber);
        //System.out.println("Audi " + audi.isCabrio + " - " + audi.color + " - " + audi.model + " - " + audi.wheelNumber);
        //System.out.println("-------------------------");
        //audi.model = "A6";

        //Garage.maxPlaces = 586;


        //System.out.println("Max places in my garage after processes " + Garage.maxPlaces);

        //System.out.println("Mini " + mini.isCabrio + " - " + mini.color + " - " + mini.model + " - " + mini.wheelNumber);
        //System.out.println("Audi " + audi.isCabrio + " - " + audi.color + " - " + audi.model + " - " + audi.wheelNumber);
    }
}
