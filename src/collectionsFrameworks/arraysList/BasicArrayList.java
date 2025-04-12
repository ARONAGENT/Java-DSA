package collectionsFrameworks.arraysList;

import java.util.ArrayList;

/*
 * Demonstration of basic ArrayList operations and its key properties:
 *
 * ArrayList Properties:
 * 1. Maintains insertion order.
 * 2. Allows duplicate elements.
 * 3. Allows null values.
 * 4. Can insert and remove elements at any index.
 * 5. Resizable array (size can grow/shrink dynamically).
 * 6. Not synchronized (not thread-safe).
 * 7. Provides random access via indexes.
 */

public class BasicArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of String type
        ArrayList<String> name = new ArrayList<>();

        // Adding elements to the ArrayList
        name.add("Rohan");      // index 0
        name.add("Rahul");      // index 1
        name.add(1, "Om");      // Inserts "Om" at index 1, shifts others to the right
        name.add("Rahul");      // Duplicate entry allowed
        name.add("");           // Empty string is also allowed
        name.add(null);         // Null is allowed in ArrayList

        // Displaying the contents of the ArrayList
        System.out.println(name);
        // Output: [Rohan, Om, Rahul, Rahul, , null]
    }
}
