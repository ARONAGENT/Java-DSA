package strings;

/*
 * StringBuffer in Java:
 * - `StringBuffer` is a mutable sequence of characters, similar to `StringBuilder`, but **thread-safe**.
 * - It is used when multiple modifications to a string are required without creating new objects.
 * - Provides methods to manipulate the content efficiently.
 *
 * Properties of StringBuffer:
 * 1. **Mutable**: Can modify content without creating a new object.
 * 2. **Thread-safe**: Synchronized for safe multi-threading.
 * 3. **Efficient for string modifications** compared to `String`.
 * 4. **Has an initial capacity** (default: 16 characters) that grows dynamically.
 */

public class StringBuffersClass {
    public static void main(String[] args) {
        // Creating an empty StringBuffer
        StringBuffer sB = new StringBuffer();

        // Appending text to StringBuffer
        sB.append("Aron Agency");
        System.out.println("StringBuffer Length: " + sB.length()); // Returns current string length
        System.out.println("StringBuffer Capacity: " + sB.capacity()); // Default capacity is 16, grows as needed

        // Appending more text (capacity will expand)
        sB.append(" Is a Company That Helps to Analyze Company Behaviors");
        System.out.println("Updated Length: " + sB.length());
        System.out.println("Updated Capacity: " + sB.capacity()); // Capacity increases dynamically

        // Inserting text at a specific index
        sB.insert(12, " Pvt Ltd");
        System.out.println("After Insert: " + sB);

        // Replacing a part of the text
        sB.replace(12, 20, " Solutions");
        System.out.println("After Replace: " + sB);

        // Deleting characters from a given range
        sB.delete(12, 22);
        System.out.println("After Delete: " + sB);

        // Reversing the StringBuffer content
        sB.reverse();
        System.out.println("Reversed StringBuffer: " + sB);
    }
}
