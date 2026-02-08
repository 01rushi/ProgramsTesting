package javaprogram;

import java.util.HashMap;

public class NumberSwap {

    public static void usingThirdVariable() {
        // -- using third variable

        int numberOne = 7249;
        int numberTwo = 928798;
        int swap;

        System.out.println("before swap 1st Number: " + numberOne);
        System.out.println("before swap 2nd Number: " + numberTwo);

        swap = numberOne;
        numberOne = numberTwo;
        numberTwo = swap;
        System.out.println("after swap 1st Number: " + numberOne);
        System.out.println("after swap 2nd Number: " + numberTwo);
        System.out.println();
    }

    public static void withoutThirdVariable() {
        int numberOne = 7249;
        int numberTwo = 9298;

        System.out.println("before swap 1st Number: " + numberOne);
        System.out.println("before swap 2nd Number: " + numberTwo);

        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;
        System.out.println("after swap 1st Number: " + numberOne);
        System.out.println("after swap 2nd Number: " + numberTwo);

    }

    public static void main(String[] args) {
        usingThirdVariable();
        withoutThirdVariable();
    }
}
