package collection_frameworks.array_deque;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * ArrayDeque (Array Double Ended Queue)
 * -------------------------------------
 * ArrayDeque is a **resizable-array implementation** of the Deque interface.
 *
 * ✅ Properties of ArrayDeque:
 * 1. Maintains **insertion order**.
 * 2. **Duplicates are allowed**.
 * 3. **Null elements are NOT allowed** (throws NullPointerException).
 * 4. It is **non-synchronized** (not thread-safe).
 * 5. **Faster than LinkedList** for most Deque operations (like add/remove from both ends).
 * 6. No capacity restriction (grows dynamically).
 * 7. Does **not support indexed access** like List.
 *
 * 🔄 Use cases:
 * - As a **queue (FIFO)** or **stack (LIFO)**.
 * - Efficient for add/remove from **both ends**.
 */

public class ArrayDeque_functions {
    public static void main(String[] args) {
        // Creating an ArrayDeque of Strings
        ArrayDeque<String> names = new ArrayDeque<>();

        // 1. Adding elements at the end
        names.add("Mango");
        names.add("Apple");
        names.add("Banana");
        names.add("Grapes");
        names.add("Strawberry");
        names.add("Orange");
        System.out.println("Original ArrayDeque: " + names); // Maintains insertion order

        // 2. Adding elements at front and rear using addFirst/addLast
        names.addFirst("Chiku");  // Adds at the front
        names.addLast("Kiwi");    // Adds at the rear
        System.out.println("After addFirst and addLast: " + names);

        // 3. Offering elements at front and rear (same as add but returns false if fails)
        names.offerFirst("Berry");
        names.offerLast("Coffee");
        System.out.println("After offerFirst and offerLast: " + names);

        // 4. Retrieving elements without removing using getFirst / getLast
        System.out.println("First element (getFirst): " + names.getFirst());
        System.out.println("Last element (getLast): " + names.getLast());
        System.out.println("Deque state: " + names);
        System.out.println();

        // 5. Peeking elements (retrieves without exception if deque is empty)
        System.out.println("First element (peekFirst): " + names.peekFirst());
        System.out.println("Last element (peekLast): " + names.peekLast());
        System.out.println("Deque state after peek: " + names);
        System.out.println();

        // 6. Removing elements from front and rear
        System.out.println("Removed first element (removeFirst): " + names.removeFirst());
        System.out.println("Removed last element (removeLast): " + names.removeLast());
        System.out.println("Deque after removeFirst and removeLast: " + names);

        // 7. Polling elements (retrieves and removes, returns null if empty)
        System.out.println("Polled first element (pollFirst): " + names.pollFirst());
        System.out.println("Polled last element (pollLast): " + names.pollLast());
        System.out.println("Deque after pollFirst and pollLast: " + names);

        // 8. Checking for existence of an element
        System.out.println("Does the deque contain 'Mango'? " + names.contains("Mango"));

        // 9. Checking if deque is empty
        System.out.println("Is deque empty? " + names.isEmpty());

        // 10. Getting size of deque
        System.out.println("Size of deque: " + names.size());

        // 11. Iterating using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // 12. Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 13. Clearing the deque
        names.clear();
        System.out.println("After clearing the deque: " + names); // Should print []
    }
}
