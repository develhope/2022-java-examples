public class Start {

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c){
        int result = sum(a,b);
        //return sum(result, c);
        int out = sum(result, c);
        return out;
    }

    public static void sumAndPrint(int a, int b){
        int sum = sum(a,b);
        System.out.println("The result of the sum between " + a + " and " + b + " is " + sum);
    }

    public static void printArray(int[] array){
        if(array == null) return;
        for (int i = 0; i<array.length;i++){
            System.out.println("["+i+"]="+array[i]);
        }
    }

    public static void printArray(double[] array){
        if(array == null) return;
        for (int i = 0; i<array.length;i++){
            System.out.println("["+i+"]="+array[i]);
        }
    }




    public static void main(String[] args) {
        int myFirstInteger = 5;
        int mySecondInteger = 10;

        System.out.println("v1 ---------------");
        int result = sum(myFirstInteger, mySecondInteger);
        System.out.println("The result of the sum between " + myFirstInteger + " and " + mySecondInteger + " is " + result);

        int result2 = sum(78, 58);
        System.out.println("78+58=" + result2);

        System.out.println("100+58=" + sum(100, 58));

        sum(3, 1,56);
        System.out.println("v2 ---------------");
        sumAndPrint(12,34);
        sumAndPrint(myFirstInteger, mySecondInteger);
        sumAndPrint(myFirstInteger, 85);

        System.out.println("---------------------------");
        int myArray[] = new int[]{1,3,4,5,6};
        printArray(myArray);

        double myArray2[] = new double[]{1,3,4,5,6};
        printArray(myArray2);

    }
}
