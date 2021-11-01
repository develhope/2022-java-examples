package it.develhope.accessibility.entities;

public class User {

    public String name;
    public String surname;
    protected String type;
    private String typePrivate;

    private boolean isAdmin = false;

    public User(){}

    /*public User(String name, String surname,String type){
        this.type = type;
        this.surname = surname;
        this.name = name;
    }*/


    public void doStuff(){
        this.auxiliaryMethod();
    }

    public void doStuff2(){
        this.auxiliaryMethod();
    }

    private void auxiliaryMethod(){
        // Do stuff
        // Do stuff
        // Do stuff
        // Do stuff
    }

    public String evaluateType() {
        if(this.type == null) return "No Type";
        return this.type;
    }

    private class UserAuxiliaryData{
        public String photo;
        public String adress;
    }

    protected void doStuffProtected(){

    }


}
