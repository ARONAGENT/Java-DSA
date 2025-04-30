package collection_frameworks.concurrent_failSafe_failFast;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Task1");
        queue.add("Task2");

        System.out.println("➡ Iterating ConcurrentLinkedQueue:");
        for (String task : queue) {
            System.out.println(task);
            queue.add("TaskX"); // No ConcurrentModificationException
        }

        System.out.println("Final Queue: " + queue);
    }
}
