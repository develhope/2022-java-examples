public class Start {


    public static void main(String[] args) {

        double a = 58;  //4.000000000000000000
        double b = 12;  //4.000000000000000000
        double c = a+b; // 6.00000000000001
        double ratio = a/b;

        System.out.println("The sum is " + c);
        System.out.println("The difference is " + (a-b));
        System.out.println("The product is " + (a*b));
        System.out.println("The ratio is " + ratio );

        //Rest of ration between a and b
        double rest = a%b;
        System.out.println("The rest is " + rest);
        double number = b * ((int)ratio) + rest;
        System.out.println("Final number is " + number);

        double integerRatio = (a-rest) / b;
        System.out.println("Integer ratio " + integerRatio);


    }
}
