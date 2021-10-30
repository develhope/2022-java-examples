package it.develhope.overrideDefaultMethods;

public class Start {

    public static void main(String...args){
        System.out.println("-------------- START -------------");

        Animal giraffe = new Animal();
        giraffe.name = "Anna";
        giraffe.type = "Giraffe";

        Animal giraffe2 = new Animal();
        giraffe2.name = "Anna";
        giraffe2.type = "Giraffe";

        Animal zebra = new Animal();
        zebra.name = "Pino";
        zebra.type = "Zebra";

        System.out.println("Printing the giraffe " + giraffe);
        System.out.println("Printing the zebra " + zebra);

        System.out.println("Printing the zebra | " + zebra + " | " + giraffe);

        // Equals ----------------
        boolean out = zebra.equals(giraffe);
        System.out.println("Is Zebra equals to Giraffe? " + out);
        boolean out2 = giraffe.equals(giraffe2);

        System.out.println("Is Giraffe equals to Giraffe? " + out2);

        try {
            Animal clonedGiraffe = giraffe.clone();
            clonedGiraffe.name = "Dolly";
            System.out.println("------- ORIGINAL " + giraffe);
            System.out.println("------- CLONED " + clonedGiraffe);
            System.out.println("-------------------------------------");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
