package javaprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountCharInString { // count duplicate char in the string
    public static void main(String[] args) {
        String givenString = "Anakitka".toLowerCase();
        int count;
        Map <Character,Integer> countChar = new HashMap<>();

        for (int i = 0; i <= givenString.length() - 1; i++) {
            if(countChar.containsKey(givenString.charAt(i))){
               count = countChar.get(givenString.charAt(i)) + 1;
               countChar.put(givenString.charAt(i),count);
              // count = 0;
            }
            else {
                countChar.put(givenString.charAt(i),1); // A - 1 , n - 2, a - 2, k -1 ,i -1 ,t -1 ,
            }
        }
        System.out.println(countChar);

        // show repetitive char
        for (Map.Entry<Character,Integer> abc: countChar.entrySet()){
             if (abc.getValue()>=2)
             {
                 System.out.println(abc.getKey());
             }
        }

    }
}
