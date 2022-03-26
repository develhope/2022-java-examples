public class StartPrint {

    public static void main(String[] args) {
        System.out.println("------------------- Start ---------------");

        Product p = new Product();
        Product p2 = new Product();
        p.name = "Whashing machine";

        System.out.println("The product name is " +  p.name);

        p2.name = "Coffee machine";

        System.out.println("The product2 name is " +  p2.name);

        Product store[] = new Product[]{p, p2, new Product()};

        for (int i = 0; i<store.length;i++){
            Product pi = store[i];
            System.out.println("The name is " + pi.name);
        }

        store[0].name = "redmi Xiaomi note 8";
        store[1].name = "HP Pavillion";

        System.out.println("Product p name = " + p.name);
        System.out.println("store[0].name = " + store[0].name);
        System.out.println("Product p2 name = " + p2.name);
        System.out.println("store[1].name = " + store[1].name);


    }
}
