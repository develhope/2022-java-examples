package it.develhope.inputOutput.concrete;

import it.develhope.inputOutput.interfaces.WriterAndReader;

import java.io.*;

public class WriteAndReadMethodB implements WriterAndReader {
    @Override
    public void write(String s, String filePath) {
        try(
                FileWriter writer = new FileWriter(filePath, false);
                PrintWriter pw = new PrintWriter(writer);
        ){
            pw.printf("Io sono lorenzo e ho %d anni %s", 30, "ciao ciao");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {

    }
}
