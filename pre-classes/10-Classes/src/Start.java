public class Start {

    public static void main(String[] args) {
        System.out.println("------------- Start");

        int i;
        i = 4;

        Product computer = new Product();
        computer.cost = 500;
        computer.availablePices = 5;
        computer.subtitle = "The best PC";
        computer.name = "HP Pavillion 5";
        computer.description = "This is the computer descpription";

        Product iPhone = new Product();
        iPhone.name = "iPhone";
        iPhone.subtitle = "iPhone 16";
        iPhone.availablePices = 4;
        iPhone.description = "Se non hai un iPhone non hai un iPhone";

        Product iMac = new Product();
        iMac.cost = 123;
        iMac.availablePices = 0;

        // Link between array and objects
        Product store[] = new Product[]{computer, iMac, iPhone};


        System.out.println("------------- End  ");
    }
}
