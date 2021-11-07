package it.develhope.exceptions;

public class AgeException extends Exception{

    int inputAge;

    AgeException(int inputAge){
        this.inputAge = inputAge;
    }

    @Override
    public String getMessage() {
        return "The Age set was not correct, you put: " + inputAge;
    }
}
