public class StartBoolean {

    //https://it.wikipedia.org/wiki/Algebra_di_Boole
    public static void main(String[] args) {

        boolean a = false;
        boolean b = false;
        boolean c = false;

        boolean x = a && b && c;
        boolean y = a || b || c;
        boolean z = a && (b || c);

        boolean not = !a;

        boolean k = a && b || !c;

        boolean j = a ^ b;


        System.out.println("The and operation  is "  + x);
        System.out.println("The OR operation is "  + y);
        System.out.println("The MIX operation is "  + z);
        System.out.println("The MIX 2 operation is "  + k);
        System.out.println("The NOT operation is "  + not);
        System.out.println("The XOR operation is "  + j);

        ///------------ Creating a boolean
        int age = 31;
        boolean amIOver18 = age > 18;
        boolean amILess50 = age < 50;
        boolean amI40 = age == 40;

        System.out.println("Am I over 18? " + amIOver18);
        System.out.println("Am I older than 50? " + !amILess50);
        System.out.println("Am I 40? " + amI40);

        boolean comparionII = age >= 18;
        boolean comparionIII = age <= 18;

        boolean amI2040 = age >= 20 && age <=40;
        System.out.println("Am I form 20 to 40? " + amI2040);



    }
}
