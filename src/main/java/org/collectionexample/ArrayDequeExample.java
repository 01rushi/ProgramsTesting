package org.collectionexample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque que = new ArrayDeque();
        que.addFirst(11);
        que.addFirst("Rushikesh");
        que.addLast("Ankita");
        que.offerFirst(12);
        System.out.println(que);
        System.out.println(que.peek());
    }
}
