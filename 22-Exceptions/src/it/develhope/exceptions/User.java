package it.develhope.exceptions;

public class User {

    public String name;
    public String surname;
    public String username;
    public int age = 0;

    public void setAge(int age) throws AgeException, ZeroAgeException {
        if(age<0){
            throw new AgeException(age);
        }
        if(age == 0){
            throw new ZeroAgeException();
        }
        this.age = age;
    }

    public void validateData() throws NullPointerException, AgeException {
        if(name == null) throw new NullPointerException("Name is null");
        if(surname == null) throw new NullPointerException("Surname is null");
        if(username == null) throw new NullPointerException("Username is null");
        if(age < 0) throw new AgeException(this.age);

    }

}
