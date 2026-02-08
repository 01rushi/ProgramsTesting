package Collections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SetExample {
    public static void main(String[] args) {
        String[] browsers = {"Chrome", "Firefox", "Safari", "Chrome", "Edge", "Firefox"};
        HashSet<String> brow = new HashSet<>();
        for (String str : browsers) {
            brow.add(str);
        }
        System.out.println("Safari brower is present: " + brow.contains("Safari"));
        System.out.println("Unique browser: " + brow);
        System.out.println("Size of uniq browsers: " + brow.size());
        String[] rawData = {"ID1", "ID2", "ID1", "ID3", "ID2"};
        HashSet<String> uniqueIDs = new HashSet<>();
        Collections.addAll(uniqueIDs, rawData);
        System.out.println("uniqueIDs: " + uniqueIDs);

    }
}
