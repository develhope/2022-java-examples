public class Start {

    public static void main(String args[]){
        System.out.println("The program is starting");

        System.out.println("------------------------------------------");
        int hour = 15;
        switch(hour){
            case 5:
                System.out.println("It's five o clock");
            break;
            case 10:
                System.out.println("It's ten o clock");
            break;
            default:
                System.out.println("Cannot determine hour");
            break;
        }

        if(hour == 5){
            System.out.println("It's five o clock");
        }else if(hour == 10){
            System.out.println("It's ten o clock");
        }else{
            System.out.println("Cannot determine hour");
        }

        if(hour > 13){
            System.out.println("Good evening");
        }else{
            System.out.println("Good morning");
        }

        System.out.println("------------------------------------------");
        String name  = "lorenzo";
        switch (name){
            case "Lorenzo":
            case "Pietro":
                System.out.println("Lorenzo or pietro linkes cakes");
                break;
            case "Mattia":
                System.out.println("Mattia likes baketball");
                break;
            default:
                System.out.println("Who are you?");
                break;
        }

        if(name.equals("Lorenzo") || name.equals("Pietro")){
            System.out.println("Lorenzo or pietro linkes cakes");
        }else if(name.equals("Mattia")){
            System.out.println("Mattia likes baketball");
        }else{
            System.out.println("Who are you?");
        }

        System.out.println("------------------------------------------");

    }
}
