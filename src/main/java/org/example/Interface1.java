package org.example;

public interface Interface1 {
     default int method1(){
        System.out.println("interface");
        int b=0;
        return b=1;
    }
    void method2();
}
