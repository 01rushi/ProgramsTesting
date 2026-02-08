package Collections;

import java.util.HashMap;
import java.util.Map;

public class ReplaceAndRemove {
    public static void main(String[] args) {
        HashMap<String,String> user = new HashMap<>();
        user.put("ID","TC_001");
        user.put("Status","Fail");
        user.put("Error","Timeout at 30s");
        if(user.get("Status").equals("Fail")){
            user.put("Status","Pass");
            user.remove("Error");
        }
        for(Map.Entry<String,String> userDetails:user.entrySet()){
            System.out.println("Key: "+userDetails.getKey() + "| value: "+ userDetails.getValue());
        }
    }
}
