package it.develhope.asyncCallbacks;

public class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("The task is completed");
    }
}
