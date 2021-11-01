package it.develhope.whileConstruct;

public class StartZeroFunction {

    public static void main(String ...args){

        System.out.println("-------------------------------------");
        Function f = new Function();

        boolean isValueFound = false;
        double foundValue = -10000;
        int maxIterations = 10000;
        int k = 0;
        double x_start = -50;
        double delta = 0.5;

        double oldValue = f.getValue(x_start); // Step 0
        while(!isValueFound &&  k <maxIterations){
            x_start += delta;
            k++;
            double newValue = f.getValue(x_start);
            //System.out.println("Values  " + newValue + " - " + oldValue + " - " + x_start + " - Iteration: " + k);
            if(newValue * oldValue <= 0){
                isValueFound = true;
                foundValue = x_start;
            }else{
                oldValue = newValue;
            }
        }
        if(isValueFound){
            System.out.println("We found the zero " + foundValue);
        }else{
            System.out.println("We did not find the zero ");
        }
    }
}
