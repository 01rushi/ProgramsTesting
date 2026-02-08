package org.example;


import com.sun.source.tree.IfTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int a;
    float b;
    char c;
    boolean f;

    public Main (int a)
    {
        this(12,11);
        this.a=a;
        System.out.println("This is parameterised constructor "+ a);
    }

    public Main (int a, int b)
    {
        this.a= a+b;
        System.out.println("This is 2 parameterised constructor "+ this.a);

    }



    public boolean newmethod (int a)
    {
        this.ifcheck();

        try{
            int b = 10/0;
            System.out.println("inside try");
            return true;
        }catch(Exception e){
            System.out.println("inside catch");
            return false;

        }finally{

            System.out.println("inside finally");

        }

    }
    public void ifcheck ()
    {
        String uName1 = "abc";
        String uName2 = "xyz";
        String uName3 = "asd";

        MethodExample methode = new MethodExample();
        methode.firstMethod();

        if(uName2=="xyz" && uName1=="abc")
        {
            if(uName3=="asd")
            {
                System.out.println("All names are correct");
            }
            else
            {
                System.out.println("3rd name is incorrect");
            }
        }
        else {
            System.out.println("No name");
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
/*        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Main M=new Main();
        boolean v = M.newmethod(1);
        System.out.println("Value " + v);*/

        new Main(10,10);
        Main M=new Main(15);
        System.out.println("values " + M.a +" " + M.b +" "+ M.c+ " "+ M.f);
        boolean v = M.newmethod(1);
        M.ifcheck();
        System.out.println("Value " + v);
    }
 }