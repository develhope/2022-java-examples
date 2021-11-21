package it.develhope.inputOutput.concrete;

import it.develhope.inputOutput.interfaces.WriterAndReader;

import java.io.*;

public class WriteAndReadMethodD implements WriterAndReader {

    @Override
    public void write(String s, String filePath) {
        try(
                OutputStream os = new FileOutputStream(filePath, true);
                DataOutputStream dos = new DataOutputStream(os);
        ){
            dos.writeChars(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try(
                InputStream inputStream = new FileInputStream(filePath);
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                ){

            String c = dataInputStream.readLine();
            System.out.println(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
