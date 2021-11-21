package it.develhope.inputOutput.concrete;

import it.develhope.inputOutput.interfaces.WriterAndReader;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class WriteAndReadMethodE implements WriterAndReader {


    @Override
    public void write(String s, String filePath) {
        try(
                RandomAccessFile file = new RandomAccessFile(new File(filePath), "rw" );
                FileChannel channel = file.getChannel();
        ){
            channel.tryLock();
            file.writeBytes(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try(
            RandomAccessFile file = new RandomAccessFile(new File(filePath), "rw" );
        ){
            String line = file.readLine();
            System.out.println(line);
        }catch (Exception e){
    e.printStackTrace();
}
    }
}
