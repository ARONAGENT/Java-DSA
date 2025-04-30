package collection_frameworks.concurrent_failSafe_failFast;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Samsung");
        list.add("Vivo");
        list.add("Realme");

        System.out.println("➡ Iterating CopyOnWriteArrayList:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String brand = iterator.next();
            System.out.println(brand);
            list.add("Oppo"); // No ConcurrentModificationException
        }

        System.out.println("Final List: " + list);
    }
}
