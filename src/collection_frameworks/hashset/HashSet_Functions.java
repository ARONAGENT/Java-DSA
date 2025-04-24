package collection_frameworks.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Demonstrates the usage of Java HashSet.
 *
 * HashSet Characteristics:
 * ✅ Internally backed by a HashTable.
 * ✅ Stores unique elements only (no duplicates).
 * ✅ Does NOT maintain insertion order (unordered collection).
 * ✅ Allows a single null value.
 * ✅ Not synchronized by default (not thread-safe).
 * ✅ Provides fast performance for add, remove, and lookup using hashing.
 */
public class HashSet_Functions {
    public static void main(String[] args) {

        // ✅ Creating a HashSet using Set interface reference
        Set<String> set = new HashSet<>();

        // ✅ Adding elements to the HashSet
        set.add("Asus");
        set.add("Lenevo");
        set.add("Hp");
        set.add("Acer");
        set.add("Dell");
        set.add("Hp");       // Duplicate - will be ignored
        set.add(null);       // One null allowed

        // ✅ Printing the entire HashSet
        // Order may differ every time due to hashing
        System.out.println("Original HashSet (unordered, no duplicates):");
        System.out.println(set);

        // ✅ Returns the hashcode of the entire HashSet
        System.out.println("\nHash code of the HashSet: " + set.hashCode());

        // ✅ Check if an element exists using contains()
        System.out.println("\nDoes the set contain 'Acer'? " + set.contains("Acer"));

        // ✅ Removing an element
        System.out.println("Removing null value: " + set.remove(null));

        // ✅ Checking if the set is empty
        System.out.println("Is the HashSet empty? " + set.isEmpty());

        // ✅ Getting the number of elements
        System.out.println("Size of the HashSet: " + set.size());

        // ✅ Iterating using For-Each loop
        System.out.println("\nIterating using For-Each loop:");
        for (String laptopBrand : set) {
            System.out.println(laptopBrand);
        }

        // ✅ Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ✅ Converting HashSet to an Array
        String[] array = set.toArray(new String[0]);
        System.out.println("\nHashSet converted to Array:");
        for (String laptopBrand : array) {
            System.out.println(laptopBrand);
        }

        // ✅ Clear the set if needed (optional)
        // set.clear();
        // System.out.println("After clearing: " + set);
    }
}
