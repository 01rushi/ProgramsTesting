package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapUse {
    public static void main(String[] args) {
        HashMap<String, String> config = new HashMap<>();
        config.put("browser", "chrome");
        config.put("url", "https://google.com");
        config.put("timeout", "30");
        System.out.println(config.get("url"));
        if (config.containsKey("browser")) {
            System.out.println("browser present");
        }
        for (Map.Entry<String, String> check : config.entrySet()) {
            System.out.println("Key: " + check.getKey() + "| value: " + check.getValue());
        }
    }
}