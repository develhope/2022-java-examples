public class Product {

    public double cost;
    public int availability;
    public String name;

    //Constructor
    public Product(){

    }

    //Constructor
    public Product(double cost, int availability, String name){
        this.cost = cost;
        this.name = name;
        this.availability = availability;
    }

    public Product(double cost, String name){
        this.cost = cost;
        this.name = name;
        this.availability = 10;
    }

    public void printDetails(){
        System.out.println("Product is: " + this.name);
        System.out.println("Cost: " + this.cost);
        System.out.println("Availability: " + this.availability);
    }

    public double getMaxIncome(){
        return this.availability * this.cost;
    }

}
