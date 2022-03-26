public class Start {

    public static void main(String[] args) {
        System.out.println("Starting -----------------------------");

        for(int i = 0; i< 10; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        for(int i = 0; i < 20 ; i+=5){
            System.out.println("i = " + i);
        }

        System.out.println("-----------------------------");
        String myArrayString[] = new String[]{ "Lorenzo", "Pippo", "Pluto", "Paperino"};
        for(int i = 0; i < myArrayString.length; i++){
            System.out.println("Array printing ["+i+"] " + myArrayString[i]);
        }

        System.out.println("-----------------------------");
        for (int  i = 1; i<= 10; i++){
            System.out.println("5*"+i+"=" + (i*5));
        }

        System.out.println("-----------------------------");
        int myArray[] = new int[8];
        for (int i = 0; i<myArray.length;i++){
            myArray[i] = i * 8;
            System.out.println("myArray["+i+"] = " + myArray[i]);
        }

        System.out.println("-------------------------- Reverse array");
        for (int  i = myArray.length-1; i>=0; i--){
            System.out.println("myArray["+i+"] = " + myArray[i]);
        }

        System.out.println("Ending -------------------------------");
    }
}
