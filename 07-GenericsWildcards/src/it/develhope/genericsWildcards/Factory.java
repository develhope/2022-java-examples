package it.develhope.genericsWildcards;

public class Factory<V extends IUser> {

    public V employee;

    public void printEmployee(){
        System.out.println("The emplyee is male: " + employee.isMale());
    }

    public V getEmployee(){
        return employee;
    }

}
