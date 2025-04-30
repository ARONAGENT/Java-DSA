package collection_frameworks.concurrent_failSafe_failFast;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("OnePlus");
        set.add("Nokia");
        set.add("Asus");

        System.out.println("➡ Iterating CopyOnWriteArraySet:");
        for (String brand : set) {
            System.out.println(brand);
            set.add("Google"); // No ConcurrentModificationException
        }

        System.out.println("Final Set: " + set);
    }
}
