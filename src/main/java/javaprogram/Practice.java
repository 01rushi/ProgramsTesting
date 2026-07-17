package javaprogram;

import java.util.Scanner;

public class Practice {

    public static void checkNumber(){
        int numbersArray[][] = {{12,22,312},{33,1,533},{234,543,54}};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to search");
        int searchNumber = sc.nextInt();
        sc.nextLine();
        boolean result = false;
        search:
        for(int i =0; i<= numbersArray.length-1 ;i++){
            for(int j = 0; j <= numbersArray[i].length -1 ;  j++){
                //System.out.println();
                if(numbersArray[i][j] == searchNumber)
                {
                    System.out.println("number is present "+ numbersArray[i][j]);
                    result = true;
                    break search;
                }
            }
        }
        if (!result){
            System.out.println("number is not present");
        }
    }

    public static void main(String[] args) {
        checkNumber();
    }
}
