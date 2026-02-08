package org.collectionexample;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionExample {
    static void dequeueExample() {
        Queue que = new PriorityQueue();
        que.add("Rushikesh");
        que.add(112);
        que.offer("Ankita");
        System.out.println(que);
        Iterator i = que.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        for (Object obj : que) {
            System.out.println(obj);
        }
        System.out.println("Sixe of queue queue : " + que.size());
        que.poll();
        que.removeAll(que);
        System.out.println(que.poll());
    //    que.remove();
      //  System.out.println(que.element());
      //  System.out.println(que.peek());

    }

    public static void main(String[] args) {
        dequeueExample();
    }
}
