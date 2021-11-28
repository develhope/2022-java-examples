package it.develhope.finalModifier;

public class Start {

    public static void main(String[] args) {
        final User lorenzo = new User("123-456-789");
        lorenzo.setName("Lorenzo");
        lorenzo.setSurname("De Francesco");
        lorenzo.setAge(30);

        Factory factory = new Factory(lorenzo, lorenzo, lorenzo);

    }
}
