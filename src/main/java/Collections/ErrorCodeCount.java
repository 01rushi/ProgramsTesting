package Collections;

import java.util.HashMap;

public class ErrorCodeCount {
    public static void main(String[] args) {
        String[] errors = {"404", "500", "404", "401", "500", "404"};
        int value = 0;
        HashMap<String,Integer> errorCode = new HashMap<>();
        for(int i =0 ; i<=errors.length-1 ; i++)
        {
//            if(errorCode.containsKey(errors[i])){
//                //  value = errorCode.get(errors[i]) + 1;
//                // value= value+1;
//                errorCode.put(errors[i],errorCode.get(errors[i]) + 1);
//            }
//            else errorCode.put(errors[i],1);
            // This one line replaces your entire if-else block
            errorCode.put(errors[i], errorCode.getOrDefault(errors[i], 0) + 1);
        }
        System.out.println(errorCode);
    }
}
