package org.collectionexample;

import java.util.*;

public class ListCollectionExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(12);
        list.add("rushikesh");
        list.add("Ankita");

        System.out.println(list);
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println(list.contains("rushi"));
        System.out.println(list.indexOf(45));
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator check = list.iterator();
        while (check.hasNext()) {
            System.out.println(check.next());
        }

        List addallCheck = new ArrayList(Arrays.asList("rushikesh", "ankita", "ambekar"));
        List removeCheck = new ArrayList(Arrays.asList("Kasar"));
        addallCheck.addAll(removeCheck);
        System.out.println(addallCheck);
        System.out.println(removeCheck);
        addallCheck.removeAll(removeCheck);
        System.out.println("after remove : " + addallCheck);
        System.out.println(removeCheck);
        Collections.sort(addallCheck);
        System.out.println(addallCheck);
        list.addLast("Ankita");
        list.addFirst("Roll Number");
        System.out.println(list);
        list.removeFirst();


    }


}
