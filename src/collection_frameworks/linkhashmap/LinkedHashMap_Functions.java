package collection_frameworks.linkhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * What are the Key Characteristics of LinkedHashMap?
 * ✅ Maintains Insertion Order – Unlike HashMap, it remembers the order in which elements were added.
 * ✅ Faster Access (O(1)) – Similar performance to HashMap.
 * ✅ Allows null Keys and Values – Just like HashMap, it allows one null key and multiple null values.
 * ✅ Not Thread-Safe – Needs external synchronization for multi-threaded access.
 * ✅ Provides Access Order Mode – Can be configured to maintain access order (useful for LRU caches).
 */

public class LinkedHashMap_Functions {

    public static void main(String[] args) {

        // 🔹 Creating LinkedHashMap to store name and role
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        // 🔹 Adding entries
        linkedHashMap.put("rohan", "developer");
        linkedHashMap.put("rahul", "data analyst");
        linkedHashMap.put("om", "tester");
        linkedHashMap.put("hrutvik", "software engg");

        // null key and null value allowed in LinkHashMap
        linkedHashMap.put(null,"eron");
//        linkedHashMap.put(null,"aron");
        linkedHashMap.put("Rushi",null);
        System.out.println(linkedHashMap);

        // ✅ Check if a key exists
        System.out.println(linkedHashMap.containsKey("rahul")); // true

        // ✅ Check if a value exists
        System.out.println(linkedHashMap.containsValue("developer")); // true

        // ✅ Get value using key
        System.out.println(linkedHashMap.get("om")); // tester

        // ✅ Check if map is empty
        System.out.println(linkedHashMap.isEmpty()); // false

        // ✅ Get size
        System.out.println("Size: " + linkedHashMap.size());

        // ✅ Iterating over keys
        System.out.println("\n🔁 Keys:");
        Iterator<String> keyIterator = linkedHashMap.keySet().iterator();
        while (keyIterator.hasNext())
            System.out.println(keyIterator.next());

        // ✅ Iterating over values
        System.out.println("\n🔁 Values:");
        Iterator<String> valueIterator = linkedHashMap.values().iterator();
        while (valueIterator.hasNext())
            System.out.println(valueIterator.next());

        // ✅ Iterating over key-value pairs
        System.out.println("\n🔁 Key-Value Pairs:");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // ✅ Replacing value for a key
        linkedHashMap.replace("om", "senior tester");
        System.out.println("\nAfter replacing om's role: " + linkedHashMap);

        // ✅ Using getOrDefault
        System.out.println("Get key 'vinay': " + linkedHashMap.getOrDefault("vinay", "Not Found"));


        // ✅ Remove a key
        linkedHashMap.remove("hrutvik");

        // ✅ Clear all entries
        linkedHashMap.clear();
        System.out.println("\nAfter clearing: " + linkedHashMap);
    }
}
