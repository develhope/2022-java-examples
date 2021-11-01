package it.develhope.ifConstruct;

public class Animal {

    public int age;
    public String type;

    public Animal(int age, String type){
        this.age = age;
        this.type = type;
    }

    public void eat(){
        if(this.type.equals("zebra")){
            System.out.println("Eating grass");
        }else if (this.type.equals("lion")){
            System.out.println("Eating meat");
        }else{
            System.out.println("Eating other");
        }
    }

    public void drink(){
        System.out.println("The animal is eating");
    }
}
