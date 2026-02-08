package org.example;

import java.lang.reflect.Type;

public class Contr {
    public static class abc {
        void test() {
            System.out.println("static class method");
        }
    public void test2() {
        Contr obj = new Contr() {
            void test323() {
                System.out.println("No name");
            }
        };
      //  obj.test323();
    }
}
    Contr()
    {
        System.out.println("default const");
    }
    Contr(int a)
    {
        this();
        System.out.println("1 parameter const");
    }
    Contr(float a, int b)
    {
        this(12);
        System.out.println("2 parameter const");

    }

    public static void main(String[] args) {
       Contr c = new Contr(3);
        Contr.abc Me= new Contr.abc();
        Me.test();

    }
}
