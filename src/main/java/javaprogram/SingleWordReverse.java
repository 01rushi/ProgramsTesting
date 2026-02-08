package javaprogram;

public class SingleWordReverse {
    public static void main(String[] args) {
        String name = "rushikesh";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        if (name.equals(reverse)){
            System.out.println("string is palindrome  " + reverse + " ");
        }
    }
}
