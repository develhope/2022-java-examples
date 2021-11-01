package it.develhope.accessibility.businessLogic;

import it.develhope.accessibility.entities.User;

public class SuperUserFromDifferentPackage extends User {



    public void doOtherStuff(){
        this.type = "ADMIN";
    }


    @Override
    public void doStuffProtected() {
        super.doStuffProtected();
    }

    private void auxiliaryMethod() {

    }

    //protected -> public
}
