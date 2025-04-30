package collection_frameworks.concurrent_failSafe_failFast;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * ✅ Fail-Safe (Thread Safe / Concurrent)
 * 🔹 Definition
 * Fail-Safe iterators don’t throw any exceptions if the collection is modified during iteration.
 * They work on a copy of the collection or are designed to handle concurrency.
 *
 *
 * | Class Name               | Type         |
 * |--------------------------|--------------|
 * | `CopyOnWriteArrayList`   | Fail-Safe    |
 * | `CopyOnWriteArraySet`    | Fail-Safe    |
 * | `ConcurrentHashMap`      | Fail-Safe    |
 * | `ConcurrentLinkedQueue`  | Fail-Safe    |
 *
 */
public class Fail_SafeClasses {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> arrayList=new CopyOnWriteArrayList<>();

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
            if(!arrayList.contains("Oppo"))
             arrayList.add("Oppo");  // allowed in fail safe classes
            // does not throw and exception of java.util.ConcurrentModificationException
        }
        System.out.println(arrayList);
    }
}
