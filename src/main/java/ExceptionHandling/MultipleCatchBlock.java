package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static int division(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter number");
            int a = sc.nextInt();
            System.out.println("enter number for devision");
            int b = sc.nextInt();
            int c=0;
            sc.nextLine();
            c =a/b;
            return  a/b;
        }
        catch(ArithmeticException e){
            System.out.println("exception "+ e.getMessage());
            throw new ArithmeticException("/0");
        }
        catch(InputMismatchException e){
            System.out.println("Input Error: I need a number, not text!");
            throw e;
            // return -1;
        }
        finally{
            System.out.println("Cleanup: Closing calculator resources.");
            sc.close();
        }

        // System.out.println("Try programiz.pro");
    }
    public static void main(String[] args) {
        try {
            System.out.println("Final Result: " + division());
        } catch (Exception e) {
            System.out.println("Main caught the crash: Test Failed.");
        }
    }
}
