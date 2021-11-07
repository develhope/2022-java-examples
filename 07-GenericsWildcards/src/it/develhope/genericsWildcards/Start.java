package it.develhope.genericsWildcards;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String ...args){
        System.out.println("START");

        List<Car> myList = new ArrayList();
        myList.add(new Car());
        Car car = myList.get(0);

        List myListGeneric = new ArrayList();
        myListGeneric.add(new Car());
        myListGeneric.add(new UserFromDB());
        myListGeneric.add("This is a string");

        List<? super IUser> listUser = new ArrayList<>();
        listUser.add(new UserBase());
        listUser.add(new UserBase());
        IUser singleIUser = (IUser)listUser.get(0);

        List<? super UserBase> listUserBase = new ArrayList<>();
        listUserBase.add(new UserFromDB());
        UserBase singleIUserBase = (UserBase)listUser.get(0);

        List<? extends  UserFromDB> adasd = new ArrayList<>();

        System.out.println("------------------------------------------------");
        Factory myFactory = new Factory();
        myFactory.employee = new UserFromDB("lorenzo", "DF", 30, true);
        myFactory.printEmployee();


        System.out.println("------------------------------------------------");
        UserFromDB lorenzo = new UserFromDB("lorenzo", "DF", 30, true);
        System.out.println(lorenzo.name);
        lorenzo = setNameToUser(lorenzo, "Nuovo nome bellissimo");
        System.out.println(lorenzo.name);
    }

    public static <T extends IUser> T setNameToUser(T user, String name){
        user.setName(name);
        return user;
    }

    public static void soStuffWithFactory(Factory<?> factory){

    }

}
