package javaprogram;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharDuplicateOccurrence {
    // find the 2nd repeating char in the string

    public static void main(String[] args) {
        String givenString = "RushikeshueU".toLowerCase();
        LinkedHashMap <Character , Integer> countChar = new LinkedHashMap();
        ArrayList list = new ArrayList();
        int count;
        String checkOccurrence="";
        for (int i = 0; i < givenString.length(); i++){
            if (countChar.containsKey(givenString.charAt(i))){
                count = countChar.get(givenString.charAt(i)) + 1;
                countChar.put(givenString.charAt(i), count);
            }
            else {
                countChar.put(givenString.charAt(i), 1);
            }
        }
        System.out.println(countChar);
    for (Map.Entry <Character, Integer> abc : countChar.entrySet()){
        if (abc.getValue()>=2){
            System.out.println("Repeated char: " + abc.getKey());
            list.add(abc.getKey());
          //  checkOccurrence = checkOccurrence + abc.getKey().toString();
        }
    }
        //System.out.println("2nd Occurrence: " + checkOccurrence.charAt(1));
        System.out.println(list.get(1)); // provide index number
    }

}
