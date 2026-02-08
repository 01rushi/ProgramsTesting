package javaprogram;

import java.util.LinkedList;

public class StringEx { // reverse only string in their place
    public static void main(String[] args) {
        String s = "anil123dasari456";
        String array[] = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String reverse = "";
       // int asize = array.length;
        for (String a:array){
           // System.out.println(a);
            if (Character.isDigit(a.charAt(0)))
            {
                reverse = reverse + a;
            }
            else
                for (int i = a.length()-1;i>=0;i--)
                {
                    reverse=reverse+a.charAt(i);
                }
        }
        System.out.println(reverse);
    }
    }
