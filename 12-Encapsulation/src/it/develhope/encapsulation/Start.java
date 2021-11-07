package it.develhope.encapsulation;

public class Start {

    public static void main(String ...args){
        User u = new User();
        u.setId("123456");
        u.setEmail("123@gmal.com");
        u.setPassword("sdsfsdfs-sdfsdf-sdf-sdfsd-f");
        u.setAddress("Via Delle Palme, 15");
        u.setName("Lorenzo");
        u.setSurname("DF");

        System.out.println(u);

        System.out.println("The car is --------------");
        Car car = new Car(12.0,2,12.0,21.0);
        car.setDoors(15);
        System.out.println(car.toString());
    }
}
