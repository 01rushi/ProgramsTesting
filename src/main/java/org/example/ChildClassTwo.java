package org.example;

public class ChildClassTwo extends ChildClassOne{


    {
        SuperClass obj = new SuperClass();
        System.out.println("Super class variable " + obj.b);
    }

    public static void main(String[] args) {
        System.out.println("Super class variable ");
    }
}
