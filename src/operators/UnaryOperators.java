package operators;

/**
 * Unary Operators:
 * - Require a single operand.
 * - Used for incrementing, decrementing, and negation.
 */

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;

        // Post-Increment (a++)
        System.out.println("Post-Increment: " + (a++)); // Prints 5, then a becomes 6

        // Pre-Increment (++a)
        System.out.println("Pre-Increment: " + (++a)); // a becomes 7, then prints 7

        // Post-Decrement (a--)
        System.out.println("Post-Decrement: " + (a--)); // Prints 7, then a becomes 6

        // Pre-Decrement (--a)
        System.out.println("Pre-Decrement: " + (--a)); // a becomes 5, then prints 5
    }
}
