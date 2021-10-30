package it.develhop.javadoc;

/**
 * This class represents an animal
 *
 * @author Lorenzo De Francesco
 */
public class Animal {

    /**
     *  The name of the animal
     */
    String name;

    /**
     * The race of the animal
     */
    String race;

    /**
     * Number of teeth 1 to 36
     */
    int numberOfTeeth;

    /**
     * Set true if animal has four
     */
    boolean hasFour;

    /**
     * This method makes the animal run
     */
    public void run(){
        // Here will be the run body
        // First step is to move a foot

        /*
        *  This is the first line of comment This is the first line of comment
         *  This is the second line of comment This is the first line of comment
        *  This is the third line of comment
        *  AAAA
        *  AAAAA
         */
        //[...]
    }

    /**
     * The animal eats
     */
    public void eat(){
        // TODO Write the implentation
        // KSB-158
        //[... Implementation... ]
    }

    public void swim(){
        // FIXME This method is buggy
    }

    /**
     * This method does stuff
     * @param input description of input 1
     * @param input2 description of input 2
     * @deprecated Please use ....
     * @return this is the return
     */
    public int doStuff(String input, int input2){
        return 0;
    }
}
