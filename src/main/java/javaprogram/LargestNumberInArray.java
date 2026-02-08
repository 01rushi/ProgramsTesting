package javaprogram;

public class LargestNumberInArray {

    public static void main(String[] args) {
        int arrayNumber[] = {2, 12, 1, 45, 3};
//        for (int a: arrayNumber){
//            int a =
//        }
        int greaterNumber = arrayNumber[0];
        int lowestNumber = arrayNumber[0];
        System.out.println(  "length: " + arrayNumber.length);
        System.out.println(  "Array: ");

        for (int i = 0; i<arrayNumber.length ; i++) {
            int number = arrayNumber[i];
            System.out.println(number);
            if (greaterNumber <= number){
               // System.out.println("if block: " + number);
                greaterNumber = number;
            }
            if (lowestNumber >= number){
                lowestNumber = number;
            }

        }
        System.out.println( "Greater number: "+greaterNumber);
        System.out.println("Lowest Number: "+ lowestNumber);

    }


}
