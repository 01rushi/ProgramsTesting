package javaprogram;

public class StringOperation {
    // reverse each word in the sentence

    public static void main(String[] args) {
        String sentence = "Rushikesh Sunil Ambekar";
        String arrSen [] = sentence.split(" ");
        String reverse="";
        int a = arrSen.length;
        System.out.println(a);
 
       // for (int i=0; i<arrSen.length ; i++)
        for(String abc : arrSen)
        {
         /*   for (int j = arrSen[i].length()-1;j>=0 ; j--) {
               // System.out.println(arrSen[i].length());
                reverse = reverse + arrSen[i].charAt(j);*/

            for(int j = abc.length()-1;j>=0;j--){
                reverse = reverse + abc.charAt(j);
            }
            System.out.print(reverse);
            reverse = " ";
        }
    }
}
