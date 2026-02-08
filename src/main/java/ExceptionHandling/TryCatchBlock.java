package ExceptionHandling;

import java.util.Scanner;

public class TryCatchBlock {
    public static int division(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter number");
            int a = sc.nextInt();
            System.out.println("enter number for devision");
            int b = sc.nextInt();
            int c=0;
            sc.nextLine();
            c = a/b;
            return c;
        }
        catch(ArithmeticException e){
            System.out.println("exception "+ e.getMessage());
            throw new ArithmeticException("/0");
        }
        finally{
            System.out.println("Cleanup: Closing calculator resources.");
            sc.close();
        }
    }
    public static void main(String[] args) {
        System.out.println("division: " + division());
    }
}
