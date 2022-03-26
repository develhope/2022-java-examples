public class StartAdvanced {

    public static void main(String[] args) {

        int myArray[] = new int[]{1,8,6,8,7,15, 88, 5,3,3,87, 8,9,5,8};

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i< myArray.length;i++){
            int single = myArray[i];

            if(single > 9){
                continue;
            }

            boolean isEven = single%2 == 0;
            if(isEven){
                //System.out.println(single + " is even");
                evenSum = evenSum + single;
            }else{
                //System.out.println(single + " is odd");
                oddSum = oddSum + single;
            }

            if(oddSum > 15){
                break;
            }
        }

        System.out.println("Sum odd " + oddSum);
        System.out.println("Sum even " + evenSum);
    }
}
