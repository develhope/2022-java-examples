package it.develhope.genericsWildcards;

public class UserBase implements IUser {
    @Override
    public String getName() {
        return "To be defined";
    }

    @Override
    public String getCompleteName() {
        return "To be defined";
    }

    @Override
    public boolean isMale() {
        return false;
    }

    @Override
    public void setName(String name) {

    }


}
