package it.develhope;

public class User {

    public UserTypeEnum type;
    public String name;
    public String surname;
    public String username;

    public User(UserTypeEnum type, String name, String surname, String username){
        this.name = name;
        this.type = type;
        this.username = username;
        this.surname = surname;
    }

    public String getCompleteName(){
        return this.name + " " + this.surname + "("  + this.username + ")";
    }

    @Override
    public String toString() {
        return "User{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
