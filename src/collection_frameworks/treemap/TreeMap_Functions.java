/**
 * TreeMap in Java:
 * ------------------
 * TreeMap is a part of Java's Collection Framework under java.util package.
 * It implements the NavigableMap interface and extends AbstractMap class.
 * It stores key-value pairs in **sorted order of keys** (by default in ascending order).
 * Internally, TreeMap uses a **Red-Black Tree** for storage.
 *
 * Key Properties:
 * - No duplicate keys allowed
 * - Maintains natural (ascending) order or custom Comparator order
 * - **Null keys are NOT allowed**, but **multiple null values are allowed**
 * - Not synchronized (not thread-safe)
 * - Suitable when sorted ordering of keys is required
 */

package collection_frameworks.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Functions {
    public static void main(String[] args) {

        // Default TreeMap (ascending key order)
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("rohan", "developer");
        treeMap.put("rahul", "data analyst");
        treeMap.put("om", "tester");
        treeMap.put("hrutvik", "software engg");
        treeMap.putIfAbsent("yash", "max developer");

        // In treemap null keys are not allowed but null values are allowed
        // treeMap.put(null,"gamer"); // ❌ This will throw NullPointerException
        treeMap.put("Vijay", null); // ✅ Null value allowed

        System.out.println("\nTreeMap in ascending order:");
        System.out.println(treeMap);

        // Custom TreeMap with reverse order (descending)
        TreeMap<String, String> treeMap1 = new TreeMap<>(Comparator.reverseOrder());
        treeMap1.put("rohan", "developer");
        treeMap1.put("rahul", "data analyst");
        treeMap1.put("om", "tester");
        treeMap1.put("hrutvik", "software engg");
        treeMap1.putIfAbsent("yash", "max developer");

        System.out.println("\nTreeMap in descending order:");
        System.out.println(treeMap1);

        System.out.println("\nValue associated with key 'Rutwik': " + treeMap1.get("Rutwik"));
        System.out.println("Does key '104' exist? " + treeMap1.containsKey("104"));
        System.out.println("Contains value 'tester': " + treeMap1.containsValue("tester"));

        treeMap1.remove("rohan");
        System.out.println("\nAfter removing key 'rohan': " + treeMap1);

        System.out.println("Is TreeMap empty? " + treeMap1.isEmpty());
        System.out.println("Size of TreeMap1: " + treeMap1.size());

        // Iterating over keys
        System.out.println("\nIterating over keys:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating over values
        System.out.println("\nIterating over values:");
        for (String value : treeMap.values()) {
            System.out.println("Value: " + value);
        }

        // Iterating over key-value pairs
        System.out.println("\nIterating over key-value pairs:");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Replacing a value
        treeMap.replace("hrutvik", "Updated Engineer");
        System.out.println("\nAfter replacing value of 'hrutvik': " + treeMap);

        // getOrDefault
        System.out.println("Fetching key 'not-present': " + treeMap.getOrDefault("not-present", "Not Found"));

        // First and last keys and entries
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        System.out.println("First entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());

        // SubMap operations (example with Integer keys)
        TreeMap<Integer, String> intMap = new TreeMap<>();
        intMap.put(101, "Joe");
        intMap.put(102, "Ben");
        intMap.put(103, "Max");
        intMap.put(104, "Leo");
        intMap.put(105, "Chris");

        System.out.println("\nLower key than 103: " + intMap.lowerKey(103));
        System.out.println("Higher key than 103: " + intMap.higherKey(103));
        System.out.println("Lower entry than 103: " + intMap.lowerEntry(103));
        System.out.println("Higher entry than 103: " + intMap.higherEntry(103));

        System.out.println("Sub-map from 102 to 104: " + intMap.subMap(102, 104));
        System.out.println("Head-map (keys less than 104): " + intMap.headMap(104));
        System.out.println("Tail-map (keys >= 103): " + intMap.tailMap(103));

        intMap.clear();
        System.out.println("\nAfter clearing the TreeMap: " + intMap);
    }
}