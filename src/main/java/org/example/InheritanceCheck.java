package org.example;

public class InheritanceCheck extends NewAbtract implements Interface1{
    public static void main(String[] args) {
        InheritanceCheck obj = new InheritanceCheck();
       int b = obj.method1();
       obj.method2();

    }

    @Override
    public void method2() {
        System.out.println("Override method 2");
    }

    @Override
    void display() {

    }
}
