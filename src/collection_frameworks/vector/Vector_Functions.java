package collection_frameworks.vector;

import java.util.Collections;
import java.util.Vector;

public class Vector_Functions {
    public static void main(String[] args) {
        // ✅ Create a Vector of type String
        Vector<String> cities = new Vector<>();

        // ✅ Adding elements using add()
        cities.add("Berlin");
        cities.add("Mosco");
        cities.add("Olso");
        cities.add("Berlin");   // duplicate values are allowed
        cities.add(null);       // null values are allowed

        // ✅ Insert an element at a specific index using add(index, element)
        cities.add(1, "Tokyo"); // adds "Tokyo" at index 1, shifting other elements

        // ✅ size() returns the number of elements in the vector
        System.out.println("Size of vector: " + cities.size());

        // ✅ getFirst() returns the first element of the vector
        System.out.println("First element: " + cities.getFirst());

        // ✅ getLast() returns the last element of the vector
        System.out.println("Last element: " + cities.getLast());

        // ✅ set(index, element) updates the value at the given index
        cities.set(3, "London");

        // ✅ addElement() is a legacy method to add an element at the end
        cities.addElement("china");

        // vector functions.... 1.insertElementAt,2.addElement,3.removeAllElements
        cities.insertElementAt("japan",2);

        // ✅ elementAt(index) retrieves element at specific index (similar to get())
        System.out.println("Element at index 1: " + cities.elementAt(1));

        // ✅ Printing current vector
        System.out.println("Vector contents: " + cities);

        // ✅ Iterate using Iterator interface
        java.util.Iterator<String> iterator = cities.iterator();
        System.out.println("Iterating elements using Iterator:");
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // ✅ Optional: Sort the vector using Collections.sort()
        // Collections.sort(cities); // can throw NullPointerException if nulls present
        cities.remove(null);

        // sorting
        Collections.sort(cities);
        System.out.println(cities);
        // reverse sorting
        Collections.reverse(cities);
        System.out.println(cities);
        System.out.println("Vector after optional sorting (skipped if null exists): " + cities);

        // ✅ Convert Vector to Array using toArray()
        String[] array = cities.toArray(new String[0]);
        System.out.println("Array elements converted from Vector: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Checking size and capacity
        System.out.println("Size of vector: " + cities.size());
        System.out.println("Capacity of vector: " + cities.capacity());
        // Iterating using for loop
        System.out.println("\nIterating using for loop:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        // Iterating using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String cityname : cities) {
            System.out.println(cityname);
        }

        System.out.println("Index of 'Japan': " + cities.indexOf("Japan"));

        // ✅ clear() removes all elements from vector
        cities.clear();
        //vector functions....
        cities.removeAllElements();
        System.out.println("After clearing the vector: " + cities);




    }

}
