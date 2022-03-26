
public class Start {

    public static void main(String args[]){
        System.out.println("The program is starting");

        int hour = 8;
        boolean isAfternoon = hour > 13;

        if(isAfternoon){
            System.out.println("Good afternoon");
        }else{
            System.out.println("Good morning");
        }

        //--------------- Attempt II ----------
        System.out.println("--------------- Attempt II ---------------- ");
        if(hour < 13){
            System.out.println("Good morning");
        }else{
            if(hour< 20){
                System.out.println("Good afternoon");
            }else{
                if(hour <23) {
                    System.out.println("Good night");
                }else{
                    System.out.println("Midnight");
                }
            }
        }

        // -------------- Attempt III ----------------
        System.out.println("--------------- Attempt III ---------------- ");
        if(hour <13){
            System.out.println("Good morning");
        }else if(hour <20){
            System.out.println("Good afternoon");
        }else if(hour < 23){
            System.out.println("Good night");
        }else{
            System.out.println("Midnight");
        }

        System.out.println("--------------- Attempt IV ---------------- ");

        if(hour <13) {
            System.out.println("Good morning");
        }
        if(hour <20){
            System.out.println("Good afternoon");
        }
        if(hour < 23){
            System.out.println("Good night");
        }

        System.out.println("Midnight");

        System.out.println("--------------- Attempt V ---------------- ");
        if(hour == 8){
            System.out.println("It's 8 o clock - wake up");
        }

        System.out.println("------------------------------------ ");
        System.out.println("The program is ending");
    }
}
