package collection_frameworks.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class More_Functions_Arraylist {
    public static void main(String[] args) {

        // Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Check if list is empty
        System.out.println("Is list empty? " + names.isEmpty());

        // Adding elements
        names.add("Rohan");
        names.add("Rahul");
        names.add("Yash");

        // Adding at specific index
        names.add(0, "Om");

        // Adding null and duplicate
        names.add(null);
        names.add("Rohan");

        // Print original list
        System.out.println("Original list: " + names);

        // Get element by index
        System.out.println("Element at index 1: " + names.get(1));

        // Replace element at index
        names.set(1, "Om kale");

        // Check if list contains an element
        System.out.println("Contains 'Yash'? " + names.contains("Yash"));

        // Remove element by index
        names.remove(5); // Removes second "Rohan"

        // Remove by value
        names.remove("Rahul");

        // Get index of an element
        System.out.println("Index of 'Yash': " + names.indexOf("Yash"));

        // Last index of an element
        System.out.println("Last index of 'Rohan': " + names.lastIndexOf("Rohan"));

        // Get size of list
        System.out.println("Size of list: " + names.size());

        // Sublist from index 0 to 2 (excluding 2)
        System.out.println("Sublist(0,2): " + names.subList(0, 2));

        // Convert to Array
        Object[] array = names.toArray();
        System.out.print("Array elements: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // Clone the list (shallow copy)
        ArrayList<String> clonedList = (ArrayList<String>) names.clone();
        System.out.println("Cloned list: " + clonedList);

        // Looping using Iterator
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Trim to size
        names.trimToSize(); // Reduces capacity to list size

        // Ensure minimum capacity
        names.ensureCapacity(20); // Optional for optimization

        // Clear the list
        names.clear();
        System.out.println("After clear(), is list empty? " + names.isEmpty());

        // Making ArrayList synchronized (optional)
        ArrayList<String> syncList = new ArrayList<>();
        Collections.synchronizedList(syncList);
    }

}

