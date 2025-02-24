package ex_26_Collection_Framework.Queue;

import java.util.PriorityQueue;

public class Lab234_Queue {
    public static void main(String[] args) {
        // Queue -> 0.001% is used in automation

        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q);

        //Queue -> First in First out.
        // Offer -> add
        // Peak -> see the last element
        // Poll ->delete

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
