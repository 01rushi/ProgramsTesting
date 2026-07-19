package javaprogram;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharInString {

    public static void checkDuplicateWordInString() { // remove duplicate char
        String name = "Rushikesh Sunil Ambekar".toLowerCase();
        // char space = ' ';
        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < name.length(); i++) {
            char charChecker = name.charAt(i);
            if (!list.contains(charChecker) && charChecker != ' ') {
                list.add(charChecker);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        checkDuplicateWordInString();

    }
}
