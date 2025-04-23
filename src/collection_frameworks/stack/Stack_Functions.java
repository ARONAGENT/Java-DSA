package collection_frameworks.stack;

import java.util.Collections;
import java.util.Stack;
/*
* ✅ Key Points Covered:
Demonstrates basic Stack operations: push(), pop(), peek(), search(), empty().
Shows integration with Collections class: sort(), reverse().
Uses Vector methods inherited by Stack: set(), capacity(), contains(), clear().
Highlights null handling, duplicate entries, and safe sorting.
* */
public class Stack_Functions {
    public static void main(String[] args) {

        // Create a new stack of strings to store college names
        Stack<String> colleges = new Stack<>();

        // Push elements onto the stack (adds to the top of stack)
        colleges.push("Sipna");
        colleges.push("Ram meghe");
        colleges.push("Pote");
        colleges.push("Shivaji");

        // Print the entire stack (last-in is at the end)
        System.out.println(colleges); // [Sipna, Ram meghe, Pote, Shivaji]

        // Pop removes and returns the top element (LIFO behavior)
        System.out.println(colleges.pop()); // Shivaji

        // Stack after pop
        System.out.println(colleges); // [Sipna, Ram meghe, Pote]

        // Peek returns the top element without removing it
        System.out.println(colleges.peek()); // Pote

        // Stack remains unchanged after peek
        System.out.println(colleges); // [Sipna, Ram meghe, Pote]

        // Check if the stack is empty
        System.out.println(colleges.empty()); // false

        // Search for "Pote", returns 1-based position from top
        System.out.println(colleges.search("Pote")); // 1

        // Push another "Pote" and null to stack
        colleges.push("Pote");
        colleges.push(null);

        // Stack after adding duplicate and null
        System.out.println(colleges); // [Sipna, Ram meghe, Pote, Pote, null]

        // Remove the null value from the stack
        colleges.remove(null);

        // Sorts the stack in ascending order (null must be removed before sorting)
        Collections.sort(colleges);
        System.out.println(colleges); // [Pote, Pote, Ram meghe, Sipna]

        // Reverses the stack elements
        Collections.reverse(colleges);
        System.out.println(colleges); // [Sipna, Ram meghe, Pote, Pote]

        // Returns the number of elements in the stack
        System.out.println(colleges.size()); // 4

        // Updates the value at index 1 with new value, returns old value
        System.out.println(colleges.set(1, "Sipna Coet")); // Ram meghe

        // Vector method: returns current capacity of the stack (default capacity doubles)
        System.out.println(colleges.capacity()); // e.g., 10 or more depending on internal resize

        // Checks if stack contains the element "Pote"
        System.out.println(colleges.contains("Pote")); // true

        // Clears all elements from the stack
        colleges.clear();
        System.out.println("Clear the stack : " + colleges); // []
    }
}
