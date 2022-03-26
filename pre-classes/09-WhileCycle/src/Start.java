
public class Start {

    public static void main(String[] args) {
        System.out.println("Start -----------------------------------");

        double myNumber = 651984899.0;

        while(myNumber > 30){
            myNumber = myNumber / 2;
            System.out.println("My number is " + ((long)myNumber));
        }

        while (true){
            System.out.println("Betting");
            double number = Math.random()*100;
            System.out.println("The number is " + (int)number);
            if(number<50){
                System.out.println("You continue");
                continue;
            }else if(number<75){
                System.out.println("You loose");
                break;
            }else{
                System.out.println("You win");
            }
        }


        double a = 54.0;

        do {
            a = a/2.0;
        }while(a > 100);

        System.out.println("The a value is "  + a);





        System.out.println("End   -----------------------------------");
    }
}
