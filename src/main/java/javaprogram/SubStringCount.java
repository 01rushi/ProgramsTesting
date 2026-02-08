package javaprogram;

import java.util.LinkedList;

public class SubStringCount {
    public static void main(String[] args) {
        String one = "ADOBECODEBANC";
        String two = "ABC";
        LinkedList list = new LinkedList<>();

        String arrayOne[] = one.split("");
        String arrayTwo[] = two.split("");

        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) == two.charAt(0))//|| one.charAt(i) == two.charAt(1) || one.charAt(i) == two.charAt(2))
            {

            }
        }
    }

}

//
//    for (String second: arrayTwo)
//        {
//        if (first.equals(second)){
//        System.out.println(first);
//                }
//                        }