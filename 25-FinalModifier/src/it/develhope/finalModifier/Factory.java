package it.develhope.finalModifier;

import lombok.Data;

@Data
public class Factory {

    private final User ceo;
    private final User cto;
    private final User cfo;

    public Factory(User ceo, User cto, User cfo){
        this.ceo = ceo;
        this.cto = cto;
        this.cfo = cfo;
    }

    public void startWorking(){
        System.out.println("Working....");

    }
}
