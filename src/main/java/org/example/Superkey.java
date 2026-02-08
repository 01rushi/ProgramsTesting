package org.example;

public class Superkey {
    int a = 15;

    void test() {
        System.out.println("This is super class test method " + this.a);
    }

    void test1() {
        System.out.println("This is super class test1 method " + this.a);
    }


    Superkey() {
        System.out.println("This is super class constructor");
    }
}
