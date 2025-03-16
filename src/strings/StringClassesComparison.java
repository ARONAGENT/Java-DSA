package strings;

import java.util.StringTokenizer;

public class StringClassesComparison {
    public static void main(String[] args) {
        /*
         * 1. String (Immutable)
         * - Once a String is created, it **cannot be changed**.
         * - Every modification creates a **new String object** in memory.
         * - It consumes **more memory** if modified frequently.
         */
        String str = "Hello";
        str = str + " World"; // Creates a new object in memory
        System.out.println("String: " + str);

        /*
         * 2. StringBuilder (Mutable & Not Thread-Safe)
         * - It is **mutable**, meaning it allows modifications without creating new objects.
         * - **Faster** than `StringBuffer` because it's **not synchronized**.
         * - Best for **single-threaded applications** where performance matters.
         */
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies the same object
        System.out.println("StringBuilder: " + sb);

        /*
         * 3. StringBuffer (Mutable & Thread-Safe)
         * - Similar to `StringBuilder` but **thread-safe** (synchronized).
         * - Slightly **slower** than `StringBuilder` due to synchronization.
         * - Best for **multi-threaded** applications.
         */
        StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.append(" World"); // Modifies the same object
        System.out.println("StringBuffer: " + sBuffer);

        /*
         * 4. StringTokenizer (Splitting Strings)
         * - Used to **split** a string into **tokens** (words, phrases).
         * - **Faster** than `split()` as it processes **tokens on demand**.
         * - Does **not support regex** (unlike `split()`).
         */
        StringTokenizer tokenizer = new StringTokenizer("Hello World Java");
        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token: " + tokenizer.nextToken());
        }
    }
}

/*
* Key Differences in Comment Lines:
✔ String → Immutable, creates new objects on modification.
✔ StringBuilder → Mutable, faster, best for single-threaded apps.
✔ StringBuffer → Mutable, thread-safe, slightly slower.
✔ StringTokenizer → Used for efficient string splitting.
* */