package org.loopingstatements;

public class loops {
    static int i = 0;
    private static int a = 2;

    {
        int J = 0;
        do {
            System.out.println("This is non static block's do condition and value of J:" + J);
            J++;
        }
        while (J <= 2);
        System.out.println("This is non static block and value of J:" + J);
        forloop(1);
    }

    static {
        int i = 0;
        do {
            System.out.println("This is static block's do condition and value of i:" + i);
            i++;
        }
        while (i <= 2);
        System.out.println("This is static block and value of i:" + i);

    }

    public int forloop(int a) {
        for (int i = a; i <= 2; i++) {
            System.out.println("Value of i is:" + i);

        }
        return i;
    }

    public static int whileloop(int a) {
        int i = 0;
        int addition = 0;
        while (i <= a) {
            // System.out.println("Value of i:" + i);
            addition = addition + i;
            i++;
        }
        return addition;
    }

    public static void main(String[] args) {
        loops nonStaticMethod = new loops();
        int i = whileloop(10);
        System.out.println("Value of i:" + i);
        int a = nonStaticMethod.forloop(1);
        System.out.println("Value of a:" + a);
    }
}
