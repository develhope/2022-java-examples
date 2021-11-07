package it.develhope.genericsWildcards;

public class UserFromDB extends UserBase {

    public String name;
    public String surname;
    public  int age;
    public boolean isMale;

    @Override
    public String getCompleteName() {
        return name + " " + surname;
    }

    public UserFromDB(){}

    public UserFromDB(String name,String surname,int age, boolean isMale){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.isMale = isMale;
    }

    @Override
    public boolean isMale() {
        return isMale;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserFromDB{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
