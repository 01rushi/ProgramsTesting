package org.example;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = obj.nextLine();
        System.out.println("Name: " + name);
        try {
            int surname = obj.nextInt();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("exception " + e);
        }
    }
}
