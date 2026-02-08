package org.example;

public class ChildClassOne extends SuperClass{
    protected static int a= 20;
    public int b=30;
     void test(){
         System.out.println("This is 1si child class static method");
         System.out.println(+b);
    }

    void dummy(){
        System.out.println("This is 1si child class static method");
        System.out.println(+this.b);
    }
    public static void main(String[] args) {
      //  display();
        System.out.println("This is parent class variable "+SuperClass.a);
        System.out.println("This is child class variable "+a);
        int a =30;
        SuperClass.a= 45;
        System.out.println("This is parent class variable "+SuperClass.a);
        System.out.println("This is child class variable "+a);


        ChildClassOne obj1 = new ChildClassOne();
        obj1.b= 25;
        System.out.println("Child class non static variable "+obj1.b);

        ChildClassOne obj2 = new ChildClassOne();
        System.out.println("Child class non static variable "+obj2.b);
//        System.out.println("Child class non static variable "+obj2.b);
//        obj2.dummy();

    }
}
