package javaprogram;

import java.util.Scanner;

public class FibonacciSeries {
    static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("enter number for list");
        scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber =1;
        int total =0;
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber+" ");
        for (int i = 0; i <= limit; i++)
        {
            total = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = total;
            System.out.print(total+" ");
        }
    }
}
