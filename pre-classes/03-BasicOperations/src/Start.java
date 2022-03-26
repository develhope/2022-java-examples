public class Start {

    public static void main(String args[]){
        System.out.println("the program is starting");

        int a = 5;
        int b = 3;
        int c = a + b;

        System.out.println("The integer A is " + a);
        System.out.println("The integer B is " + b);
        System.out.println("The sum is " + c);

        int d = a - b;
        System.out.println("The difference is " + d);

        int e = a * b;
        System.out.println("The product is " + e);

        double divInt = a / b; //1.6
        double divFloat = (float)a / (float)b; //1.6 //16
        double divDouble = (double)a / (double)b; //1.6 // 32
        double divMixed = a / (float)b; //1.6
        double divMixedDouble = a / (double)b; //1.6
        double divMixedFloatDouble = (float)a / (double)b; //1.6

        double divPractice = (double)a / b; //1.6

        System.out.println("The ratio is " + divInt);
        System.out.println("The ratio is " + divFloat);
        System.out.println("The ratio is " + divDouble);
        System.out.println("The ratio is " + divMixed);
        System.out.println("The ratio is " + divMixedDouble);
        System.out.println("The ratio is " + divMixedFloatDouble);

        System.out.println("The ratio is " + divPractice);
    }

}
