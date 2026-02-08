package org.example;

public class SuperClass {
   protected static int a = 10;
    public int b = 15;

    static void display()
    {
        System.out.println("This is super class");
    }
    void test(){
        System.out.println("This parent method");
        System.out.println(+b);
    }
}

