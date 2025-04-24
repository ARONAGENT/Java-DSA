package collection_frameworks.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap in Java (Part of Java Collection Framework)
 * ---------------------------------------------------
 * ✅ Stores key-value pairs.
 * ✅ Keys are unique, values can be duplicate.
 * ✅ Insertion order is NOT maintained.
 * ✅ Allows one null key and multiple null values.
 * ✅ Not synchronized (use Collections.synchronizedMap for thread safety).
 * ✅ Uses Hashing for fast data retrieval (O(1) average time).
 * ✅ Internally uses HashTable-like bucket mechanism via hashCode().
 * ✅ Duplicate keys overwrite previous values.
 */

public class HashMap_Functions {
    public static void main(String[] args) {
        // Creating a HashMap to store employee roles
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("rohan", "developer");
        hashMap.put("rahul", "data analyst");
        hashMap.put("om", "tester");
        hashMap.put("hrutvik", "software engg");
        hashMap.putIfAbsent("yash","max devloper");

        // Check if a specific key exists
        System.out.println("Contains key 'rahul'? " + hashMap.containsKey("rahul")); // true

        // Check if a specific value exists
        System.out.println("Contains value 'Vicky'? " + hashMap.containsValue("Vicky")); // false

        // Fetching a value using a key
        System.out.println("Value for key 'om': " + hashMap.get("om")); // tester

        // Check if the map is empty
        System.out.println("Is HashMap empty? " + hashMap.isEmpty()); // false

        // Get size of the map
        System.out.println("Size of HashMap: " + hashMap.size()); // 4

        // Iterating over keys
        System.out.println("\nHashMap Keys:");
        Iterator<String> keyIterator = hashMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
        }

        // Iterating over values
        System.out.println("\nHashMap Values:");
        Iterator<String> valueIterator = hashMap.values().iterator();
        while (valueIterator.hasNext()) {
            System.out.println(valueIterator.next());
        }

        // Print entire HashMap
        System.out.println("\nComplete HashMap:");
        System.out.println(hashMap);

        // Iterating over key-value pairs
        System.out.println("\nIterating over key-value pairs using entrySet():");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Replacing a value for an existing key
        hashMap.replace("rohan", "senior developer");
        System.out.println("\nAfter replacing value for 'rohan':");
        System.out.println(hashMap);

        // Using getOrDefault() to fetch value or return a default if not found
        System.out.println("Fetching key 'sagar': " + hashMap.getOrDefault("sagar", "Not Found"));

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("\nAfter clearing the HashMap:");
        System.out.println(hashMap);
    }
}
