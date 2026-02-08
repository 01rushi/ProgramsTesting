package javaprogram;

import java.util.Scanner;

public class Array {
    public static void checkNumberPositionInArray(){
            int array[][]={{1,3,5},
                    {1,6,8},
                    {6,4,2,5}};
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number to search");
            int findNumber =sc.nextInt();
            sc.nextLine();
            int sum = 0;
            //  System.out.println(row);
        boolean numberPresent =false;
        search:
            for(int i =0 ; i<= array.length-1 ; i++){
                for(int j =0 ; j<=array[i].length-1 ; j++)
                {
                    if(array[i][j] == findNumber){
                        System.out.println("Number found at row:" + (i+1) + " column: "+ (j+1));
                        numberPresent =true;
                        break search;
                    }
                }
            }
            if (!numberPresent){
                System.out.println("number is not present");
            }

    }
    public static void sumOfEachRow(){
        int array[][]={{1,3,5},
                {1,6,8},
                {6,4,2,5}};
        int sum = 0;
        //  System.out.println(row);

        for(int i =0 ; i<= array.length-1 ; i++){
            for(int j =0 ; j<=array[i].length-1 ; j++)
            {
                sum = sum + array[i][j];
            }
            System.out.println("sum of row number "+(i+1)+" is "+ sum);
            sum = 0;
        }
    }

    public static void main(String[] args) {
        checkNumberPositionInArray();
        sumOfEachRow();
    }
}
