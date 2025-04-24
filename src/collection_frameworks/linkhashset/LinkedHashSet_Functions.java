package collection_frameworks.linkhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// LinkedHashSet → Maintains insertion order + Ensures uniqueness
// 1. No duplicate elements allowed
// 2. Maintains insertion order
// 3. Allows one null element
// 4. Not synchronized
// 5. Internally uses LinkedHashMap (hashing + doubly linked list)

public class LinkedHashSet_Functions {
    public static void main(String[] args) {
        // Creating LinkedHashSet using Set reference (polymorphism)
        Set<String> laptops = new LinkedHashSet<>();

        // Adding elements
        laptops.add("Asus");
        laptops.add("Lenovo");
        laptops.add("HP");
        laptops.add("Acer");
        laptops.add("Dell");
        laptops.add("HP"); // Duplicate, won't be added
        laptops.add(null); // One null allowed

        // Printing the LinkedHashSet (insertion order preserved)
        System.out.println("Original LinkedHashSet: " + laptops);

        // Hash code (not based on insertion order, just internal representation)
        System.out.println("Hash code of set: " + laptops.hashCode());

        // Contains – Check if specific element exists
        System.out.println("Does set contain 'Acer'? " + laptops.contains("Acer"));

        // Remove – Removing an element (null in this case)
        System.out.println("Removing null: " + laptops.remove(null));

        // isEmpty – Check if set is empty
        System.out.println("Is set empty? " + laptops.isEmpty());

        // size – Total number of elements
        System.out.println("Set size: " + laptops.size());
        System.out.println();

        // Iterating using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String brand : laptops) {
            System.out.println(brand);
        }

        // Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = laptops.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Converting LinkedHashSet to array
        String[] laptopArray = laptops.toArray(new String[0]);
        System.out.println("\nLinkedHashSet converted to array:");
        for (String brand : laptopArray) {
            System.out.println(brand);
        }

        // Clearing all elements
        laptops.clear();
        System.out.println("\nAfter clearing the LinkedHashSet: " + laptops);
    }
}
