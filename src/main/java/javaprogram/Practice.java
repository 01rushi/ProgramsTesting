package javaprogram;

import java.util.*;

public class Practice {

    public static void checkNumber() {
        int numbersArray[][] = {{12, 22, 312}, {33, 1, 533}, {234, 543, 54}};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to search");
        int searchNumber = sc.nextInt();
        sc.nextLine();
        boolean result = false;
        search:
        for (int i = 0; i <= numbersArray.length - 1; i++) {
            for (int j = 0; j <= numbersArray[i].length - 1; j++) {
                //System.out.println();
                if (numbersArray[i][j] == searchNumber) {
                    System.out.println("number is present " + numbersArray[i][j]);
                    result = true;
                    break search;
                }
            }
        }
        if (!result) {
            System.out.println("number is not present");
        }
    }

    public static void findRepeatingChar() {
        // find the 2nd repeating char in the string
        String givenString = "Rushikeshus".toLowerCase();
        System.out.println("Given String: " + givenString);
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < givenString.length(); i++) {
            if (map.containsKey(givenString.charAt(i))) {
                map.put(givenString.charAt(i), map.get(givenString.charAt(i)) + 1);
            } else {
                map.put(givenString.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> abc : map.entrySet()) {
            if (abc.getValue() > 1) {
                // System.out.println("1st repeated character: "+abc);
                // break;
                list.add(abc.getKey());
            }
        }
        System.out.println("second repeated character is: " + list.get(1));
    }

    public static void countCharInString() {
        // count duplicate char in the string
        String givenString = "Rushikesh Ankita".toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < givenString.length(); i++) {
            if (map.containsKey(givenString.charAt(i)) && givenString.charAt(i) != ' ') {
                map.put(givenString.charAt(i), map.get(givenString.charAt(i)) + 1);
                list.add(givenString.charAt(i));
            } else {
                map.put(givenString.charAt(i), 1);
            }
        }
        System.out.println(list);
        System.out.println(map);
    }

    public static void fibonacciSequence() {
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = firstNumber + secondNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length for sequence");
        int seq = sc.nextInt();
        sc.nextLine();
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        for (int i = 1; i <= seq; i++) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.println(sum);
        }
    }

    public static void largestNumberInArray() {
        int givenArray[] = {22, 43, 11, 56, 77, 83, 21, 1};
        int largestNumber = givenArray[0];
        int smallestNumber = givenArray[0];
        for (int i = 0; i < givenArray.length; i++) {
            if (largestNumber < givenArray[i]) {
                largestNumber = givenArray[i];
            } else if (smallestNumber > givenArray[i]) {
                smallestNumber = givenArray[i];
            }
        }
        System.out.println("largest number: " + largestNumber);
        System.out.println("lowest number: " + smallestNumber);
    }

    public static void removeDuplicateChar() {
        // remove duplicate char
        String givenString = "Rushikesh Sunil Ambekar".toLowerCase();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < givenString.length(); i++) {
            set.add(givenString.charAt(i));
        }
        for (char ch : set) {
            System.out.print(ch);
        }
        System.out.println(set);

    }

    public static void moveDigitAtLast() {
        // move all '1' to last
        int numberArray[] = {1, 2, 3, 4, 1, 2, 14, 5, 1};
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int abc : numberArray) {
            if (abc == 1) {
                list.addLast(abc);
            } else {
                list.add(index, abc);
                index++;
            }
        }
        System.out.println(list);
    }

    public static void swapNumber() {
        int firstNumber = 82934;
        int secondNumber = 67364;
        System.out.println("1st number before swap: " + firstNumber);
        System.out.println("2nd number before swap: " + secondNumber);
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("1st number after swap: " + firstNumber);
        System.out.println("2nd number after swap: " + secondNumber);
    }

    public static void checkPalindromeNumber() {
        int givenNumber = 1344311;
        int originalNumber = givenNumber;
        int reverseNumber = 0;
        int reminder = 0;
        while (givenNumber != 0) {
            reminder = givenNumber % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            givenNumber = givenNumber / 10;
        }
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reverse number: " + reverseNumber);
        if (originalNumber == reverseNumber) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }

    public static void singleWordReverse() {
        String givenString = "abggba";
        System.out.println("Original String: " + givenString);
        String reverse = "";
        String originalString = givenString;
        for (int i = givenString.length() - 1; i >= 0; i--) {
            reverse = reverse + givenString.charAt(i);
        }
        System.out.println(reverse);
        if (givenString.equals(reverse)) {
            System.out.println("String is Palindrome : " + reverse);
        } else System.out.println("String is not Palindrome");
    }

    public static void eachWordReverse() {
        String sentence = "Rushikesh Sunil Ambekar";
        String arrSen[] = sentence.split(" ");
        String reverse = "";
        for (String abc : arrSen) {
            for (int i = abc.length() - 1; i >= 0; i--) {
                reverse = reverse + abc.charAt(i);
            }
            reverse = reverse + " ";
        }
        System.out.println(reverse);
    }

    public static void reverseOnlyString() {
        String givenString = "rushi123Ankita456";
        String arr[] = givenString.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String reverse = "";
        for (String abc : arr) {
            if (Character.isDigit(abc.charAt(0))) {
                reverse = reverse + abc;
            } else {
                for (int i = abc.length() - 1; i >= 0; i--) {
                    reverse = reverse + abc.charAt(i);
                }
            }
        }
        System.out.println("Original String: "+ givenString);
        System.out.println("After Changes: "+reverse);
    }


    public static void main(String[] args) {
        //checkNumber();
        //findRepeatingChar();
        //countCharInString();
        //fibonacciSequence();
        //largestNumberInArray();
        //removeDuplicateChar();
        //moveDigitAtLast();
        //swapNumber();
        //checkPalindromeNumber();
        //singleWordReverse();
        //eachWordReverse();
       // reverseOnlyString();



        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("entered number: "+a);
        if (args.length > 0) {
            System.out.println("Target Environment: " + args[0]);
        } else {
            System.out.println("No environment specified. Defaulting to Localhost.");
        }
        System.out.println("gitcheck branch");
    }
}
