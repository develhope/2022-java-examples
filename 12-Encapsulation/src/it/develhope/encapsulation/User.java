package it.develhope.encapsulation;

public class User {

    private String id;
    private String email;
    private String password;
    private UserAdditionalData userAdditionalData = new UserAdditionalData();

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.userAdditionalData.getName();
    }

    public void setName(String name) {
        this.userAdditionalData.setName(name);
    }

    public String getSurname() {
        return userAdditionalData.getSurname();
    }

    public void setSurname(String surname) {
        userAdditionalData.setSurname(surname);
    }

    public String getAddress() {
        return userAdditionalData.getAddress();
    }

    public void setAddress(String address) {
        userAdditionalData.setAddress(address);
    }
}
