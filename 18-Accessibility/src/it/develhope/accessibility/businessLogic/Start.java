package it.develhope.accessibility.businessLogic;

import it.develhope.accessibility.entities.User;
import it.develhope.accessibility.utility.UserUtility;

public class Start {

    public static void main(String ...args){
        User user = new User();
        user.name = "asdasd";
        user.surname = "asdasd";

        //user.isAdmin = true;

        user.doStuff();

        String completeName = UserUtility.getCompleteName(user);
        String type = new UserUtility().getType(user);

        ///---------------------------------------

    }
}
