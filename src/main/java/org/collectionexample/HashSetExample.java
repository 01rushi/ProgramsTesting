package org.collectionexample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Set set2 = new HashSet();
        set.add(12);
        set.add(12);
        set.add(14);
        set.add(15);
        System.out.println("1ST hashset: " + set);
        set2.add(12);
        set2.add(16);
        set2.add(17.12);
        System.out.println("2nd Hashset: " + set2);
        set2.addAll(set);
        System.out.println("Union: " + set2);
//        set2.retainAll(set);
//        System.out.println("intersection: " + set2);
        set2.removeAll(set);
        System.out.println("Difference: " + set2);

    }
}
