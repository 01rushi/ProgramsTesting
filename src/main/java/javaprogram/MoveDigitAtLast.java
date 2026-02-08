package javaprogram;

import java.util.LinkedList;

public class MoveDigitAtLast {
    // move all '1' to last
    public static void main(String[] args) {
        int numberArray[] = {1,2,3,4,1,2,14,5,1};
        LinkedList<Integer> list = new LinkedList <Integer>();
        int index = 0;
        for (int i =0 ; i<numberArray.length;i++)
        {
            if (numberArray[i]==1){
                list.addLast(numberArray[i]);
            }
            else {
                list.add(index,numberArray[i]);
                index++;

            }
        }
        System.out.println(list);
/*
        for (int j : numberArray) {
            if (j == 1) {
                list.addLast(j);
            } else {
                list.add(index,j);
            }
        }
 */
    }
}
