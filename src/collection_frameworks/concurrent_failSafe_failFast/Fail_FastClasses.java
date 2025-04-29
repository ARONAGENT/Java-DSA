package collection_frameworks.concurrent_failSafe_failFast;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 🔴 Fail-Fast (Not Thread Safe)
 * 🔹 Definition
 * Fail-Fast iterators immediately throw ConcurrentModificationException
 * if the collection is structurally modified after the iterator is created (except via iterator's own methods).
 *
 * | Class Name              | Type        |
 * |-------------------------|-------------|
 * | `ArrayList`             | Fail-Fast   |
 * | `LinkedList`            | Fail-Fast   |
 * | `HashMap`               | Fail-Fast   |
 * | `HashSet`               | Fail-Fast   |
 * | `TreeMap`               | Fail-Fast   |
 * | `Vector`                | Fail-Fast   |
 * | `Stack`                 | Fail-Fast   |
 *
 */
public class Fail_FastClasses {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Samsung");
        arrayList.add("Vivo");
        arrayList.add("Redmi");
        arrayList.add("Poco");
        arrayList.add("Realme");
        arrayList.add("Apple");
        arrayList.add("Moto");
        arrayList.add("IQ");

        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // arrayList.add("Oppo"); not allowed in failFast classes
            //  throw and exception java.util.ConcurrentModificationException

        }

        // similarly LinkList ,Set ,Map are also fail fast classes
    }
}
