public class Start {

    //https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types
    public static void main(String[] args) {
        System.out.println("The Program is starting");

        /*int amount;
        amount = 47;*/

        int amount = 47; //€
        int cost = -56; //€
        System.out.println("Printing INT " + amount);

        // Heavy space
        long amountLong = 47; //€
        long costLong = -56; //€
        System.out.println("Printing Long " + amountLong);


        float littleDecimalNumber = 4.5F;
        double bigDecimalNumber = 4.5;

        int intgerNumber = 5; //5
        double number = 5; //5.00000000000000000001

        byte myByte = 56;


        System.out.println("Printing float " + littleDecimalNumber);
        System.out.println("Printing double " + bigDecimalNumber);

        boolean myBoolean = false;
        boolean myBooleanFalse = true;

        System.out.println("Printing boolean " + myBoolean);
        System.out.println("Printing booleanFalse " + myBooleanFalse);

        char myChar = 'L';

        String name = "Lorenzo";

        System.out.println("Printing char " + myChar);

        System.out.println("The Program is ending");
    }
}
