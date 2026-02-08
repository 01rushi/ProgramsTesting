package org.example;

public class ExceptionExample {
    static String exception;
    static String nullPointerException;
    static String arithmeticExceptionExample() {
        try {

            int i = 10 / 0;
            System.out.println(i);
        } catch (Exception e) {
            //  throw new RuntimeException(e);
            System.out.println("exception " + e);
            exception = e.getMessage();

        } finally {
            System.out.println("this is finally block");

        }
        return(exception);
    }
    public String nullPointerExceptionExample(){
        try{
            String abc = null;
            int length = abc.length();
            System.out.println("fatl ka");
            return nullPointerException;
        } catch (Exception e) {
          //  throw new RuntimeException(e);
            System.out.println("null exception"+e);
            nullPointerException = e.getMessage();
        }
        finally {
            System.out.println("nullPointerException finally block");
        }
        return "aabc";
    }
void arrayIndexException(){
try{
    int arrya[]= new int[1];
    arrya[3]=4;
} catch (Exception e) {
  //  throw new RuntimeException(e);
    System.out.println(e);
}
}

    public static void main(String[] args) {
        arithmeticExceptionExample();
        System.out.println("exception" + exception);
        ExceptionExample obj = new ExceptionExample();
        nullPointerException = obj.nullPointerExceptionExample();
        System.out.println("Null pointer exception " + nullPointerException);
        obj.arrayIndexException();
    }
}
