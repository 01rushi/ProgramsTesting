package org.example;

public class ArryaExample {
    static void arrayCount()
    {
        Object a[]= new Object[5];
        a[0]= 12;
        a[1]="rushi";

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        arrayCount();
    }
}
