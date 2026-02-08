package org.example;

public class Childsuperkey extends Superkey {
    static Childsuperkey objChildClass = new Childsuperkey();
    int a = 20;

    void methode() {
        System.out.println("method 1 in child class");
        System.out.println("value of a in child class " + this.a);
        System.out.println("value of a in child class from super class " + super.a);
        super.test();
    }

    void test() {
        System.out.println("child class test method");
        // super.test();
        // objChildClass.methode();
    }

    void childtest() {
        System.out.println("child class child test method");
        // super.test();
        // objChildClass.methode();
    }
//    Childsuperkey()
//    {
//        //super(11);
//        System.out.println("This is child class constructor");
//    }

    public static void main(String[] args) {
        System.out.println("Main method started ");
        Childsuperkey anku = new Childsuperkey();
        anku.childtest();
        System.out.println(anku.a);
        //  objChildClass.methode();
        //   objChildClass.test();
        //  new Childsuperkey();
    }
}
