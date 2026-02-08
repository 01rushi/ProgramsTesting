package org.example;

class Second {
    void test() {
        System.out.println("static class method");
    }
}
class annonyss{
    void newmethod()
    {
        Second sc = new Second() {
            void test() {
                System.out.println("inner method");
            }
        };
        sc.test();
    }
}


public class Main1 {
    public static void main(String[] args) {
        Second sc = new Second() {
            void test() {
                System.out.println("inner method");
            }
        };
        annonyss an = new annonyss();
        an.newmethod();
    }
}
