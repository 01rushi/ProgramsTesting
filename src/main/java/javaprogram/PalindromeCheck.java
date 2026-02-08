package javaprogram;

public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 121;
        int reminder = 0;
        int reverse =0;
        int orignalNumber = number;
        while (number!=0){
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
             number /= 10;
        }
        System.out.println(reverse);
        if (orignalNumber == reverse){
            System.out.println("number is palindrome " + reverse);
        }else System.out.println("Number is not palindrome "+ reverse);
    }
}
