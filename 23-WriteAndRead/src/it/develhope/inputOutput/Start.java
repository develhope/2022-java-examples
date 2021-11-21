package it.develhope.inputOutput;

import it.develhope.inputOutput.concrete.*;
import it.develhope.inputOutput.interfaces.WriterAndReader;

public class Start {

    public static void main(String ...args){

        String stringToWrite = "Lorem ipsum";
        String fileToWrite = "C:\\Users\\loren\\develhopeFile.txt";

        /*WriterAndReader wr = new WriteAndReadMethodE();
        wr.write(stringToWrite, fileToWrite);
        wr.read(fileToWrite);*/

        WriteAndReadOnTemporary.write(stringToWrite);
    }
}
