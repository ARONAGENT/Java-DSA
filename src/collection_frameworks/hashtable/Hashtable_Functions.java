package collection_frameworks.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * ===============================
 * 💡 Java Hashtable – Theory & Characteristics
 * ===============================
 * - Hashtable is a part of the Java Collection Framework that implements the Map interface.
 * - It stores data in key-value pairs.
 * - Internally uses a **hash table** (array of buckets) for storing data based on **hash codes of keys**.
 * - Every key must be unique and **non-null**, and every value must also be **non-null**.
 * - **Thread-safe**: All methods are synchronized, making it suitable for multi-threaded environments.
 * - It does **not maintain insertion order**.
 * - Slower than HashMap due to synchronization overhead.
 * - Lookup, insertion, and deletion take **O(1)** time on average.

 * ===============================
 * ✅ Hashtable Properties:
 * ===============================
 * - ❌ No null keys or null values allowed.
 * - ✅ Keys must be unique.
 * - ✅ Thread-safe (Synchronized).
 * - ❌ Does not preserve insertion order.
 * - ✅ Fast data access using hash codes.
 * - ✅ Suitable for multi-threaded programs where thread-safety is required.
 */

public class Hashtable_Functions {
    public static void main(String[] args) {

        // Creating a Hashtable with Integer keys and String values
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding key-value pairs using put()
        hashtable.put(1, "Rohan");
        hashtable.put(2, "Rahul");
        hashtable.put(3, "Ritesh");
        hashtable.put(4, "Ruturaj");
        hashtable.put(67, "Aron");

        // no null keys and values are allowed in hashtable
        hashtable.put(null,"parag");
        hashtable.put(7,null);
        System.out.println(hashtable);

        // Checking if key '3' exists
        System.out.println(hashtable.containsKey(3)); // true

        // Checking if a value 'Vicky' exists
        System.out.println(hashtable.containsValue("Vicky")); // false

        // Fetching value using key
        System.out.println(hashtable.get(67)); // Aron

        // Checking if hashtable is empty
        System.out.println(hashtable.isEmpty()); // false

        // Using contains() (old method - checks value existence)
        System.out.println(hashtable.contains("Rohan")); // true

        // Size of hashtable
        System.out.println(hashtable.size());

        // Iterating only over keys
        System.out.println("HashTable Keys ->");
        Iterator<Integer> iterator = hashtable.keys().asIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // Iterating only over values
        System.out.println("HashTable Values ->");
        Iterator<String> iterator1 = hashtable.values().iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());

        // Printing the entire hashtable
        System.out.println(hashtable);

        // Iterating over key-value pairs using entrySet()
        System.out.println("\nIterating over key-value pairs:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Replacing a value for a given key
        hashtable.replace(67, "Aron Updated");
        System.out.println("After replacing value of key 67: " + hashtable);

        // Using getOrDefault() to avoid NullPointerException
        System.out.println("Fetching key 1090 (not present): " + hashtable.getOrDefault(1090, "Not Found"));

        // Clearing all entries from hashtable
        hashtable.clear();
        System.out.println("After clearing the Hashtable: " + hashtable);
    }
}
