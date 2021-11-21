package it.develhope.inputOutput.concrete;

import it.develhope.inputOutput.interfaces.WriterAndReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteAndReadMethodA implements WriterAndReader {
    @Override
    public void write(String s, String filePath) {
        try(
                FileWriter writer = new FileWriter(filePath);
                BufferedWriter br = new BufferedWriter(writer);
        ){
            br.write(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try(
                FileReader reader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(reader);
        ){
            System.out.println("----------------------------------------");
            while (br.ready()){
                String line = br.readLine();
                System.out.println(line);
            }
            System.out.println("----------------------------------------");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
