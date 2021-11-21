package it.develhope.asyncCallbacks;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.RunnableFuture;

public class Start {

    public static void main(String[] args) {
        /*CompletableFuture<Void> myTaskRunanble = CompletableFuture.runAsync(new MyTask());
        myTaskRunanble.join();
        System.out.println("--------------------------------------------");*/



        CompletableFuture<String> myTaskRunanbleWithReturn =  CompletableFuture.supplyAsync(new MyTaskWithReturn());
        myTaskRunanbleWithReturn.thenApply(inputFromPrevious -> {
                System.out.printf("Previous task is finished and i have output: %s \n", inputFromPrevious);
                return "The return is ALLOWED there";
        })
                /*.thenAccept(input -> {
            System.out.printf("Previous task is finished and result is: %s\n", input);
            //return "The return is ALLOWED there";
        }).thenRun(() -> {
            System.out.println("Previous task is finished and i have no output");
            //return "The return is not allowed there";
        })*/
                .handle((output, throwable) -> {
            System.out.println("***Handle**");
            if(throwable!= null){
                throwable.printStackTrace();
            }

            if(output != null){
                System.out.printf("The final output is %s \n", output);
            }

            return "the previous return";
        }).whenComplete((output, throwable) -> {
            System.out.println("***When complete**");
            if(throwable!= null){
                throwable.printStackTrace();
            }

            if(output != null){
                System.out.printf("The final output is %s", output);
            }
        }).join();
    }



}
