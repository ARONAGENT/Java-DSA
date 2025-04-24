package collection_frameworks.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Functions {
    public static void main(String[] args) {

        // Creating a TreeSet of Strings
        // TreeSet stores unique elements in sorted (natural) order
        TreeSet<String> brands = new TreeSet<>();

        // Adding elements to the TreeSet
        brands.add("Asus");
        brands.add("Lenovo");
        brands.add("Dell");
        brands.add("Hp");
        brands.add("Acer");

        // Duplicate value "Hp" will be ignored
        brands.add("Hp");

        // brands.add(null);  // ❌ Uncommenting this will throw NullPointerException

        // Printing TreeSet (Sorted order, unique only)
        System.out.println("TreeSet elements (sorted & unique):");
        System.out.println(brands);

        // Size of TreeSet
        System.out.println("\nSize of TreeSet: " + brands.size());

        // Check if a particular brand exists
        System.out.println("Does it contain 'Acer'? " + brands.contains("Acer"));

        // Remove an element
        brands.remove("Lenovo");
        System.out.println("After removing 'Lenovo': " + brands);

        // Check if TreeSet is empty
        System.out.println("Is TreeSet empty? " + brands.isEmpty());

        // First and Last elements (sorted set)
        System.out.println("\nFirst Element: " + brands.first());
        System.out.println("Last Element: " + brands.last());

        // Higher & Lower elements (closest navigation)
        System.out.println("Element higher than 'Dell': " + brands.higher("Dell"));
        System.out.println("Element lower than 'Hp': " + brands.lower("Hp"));

        // Iterating using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String brand : brands) {
            System.out.println(brand);
        }

        // Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = brands.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Converting TreeSet to an Array
        String[] brandArray = brands.toArray(new String[0]);
        System.out.println("\nTreeSet converted to array:");
        for (String b : brandArray) {
            System.out.println(b);
        }

        // Poll operations (remove and return first/last element)
        System.out.println("\nPolling operations:");
        System.out.println("pollFirst(): " + brands.pollFirst());
        System.out.println("pollLast(): " + brands.pollLast());
        System.out.println("TreeSet after polling: " + brands);
    }
}
