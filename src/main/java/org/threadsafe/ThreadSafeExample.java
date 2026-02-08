package org.threadsafe;

public class ThreadSafeExample {
    synchronized void printTable(int tableDigit) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(tableDigit * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    ThreadSafeExample t;

    MyThread1(ThreadSafeExample t) {
        this.t = t;
    }

    public void run() {
        t.printTable(2);
    }
}

class MyThread2 extends Thread {
    ThreadSafeExample t;

    MyThread2(ThreadSafeExample t) {
        this.t = t;
    }
    public void run(){
        t.printTable(50);
    }
}

 class Snychro{
    public static void main(String[] args) {
        ThreadSafeExample obj = new ThreadSafeExample();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}