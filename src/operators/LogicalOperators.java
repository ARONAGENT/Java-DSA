package operators;

/*
 * Logical Operators:
 * - Used in conditional statements.
 * - Operates on boolean values.
 *
 * Truth Table:
 * ---------------------------------------------
 * A       B       A && B    A || B    !A
 * ---------------------------------------------
 * true    true    true      true      false
 * true    false   false     true      false
 * false   true    false     true      true
 * false   false   false     false     true
 */

public class LogicalOperators {
    public static void main(String[] args) {
        boolean A = true, B = false;

        // Logical AND (&&)
        System.out.println("A && B: " + (A && B)); // false

        // Logical OR (||)
        System.out.println("A || B: " + (A || B)); // true

        // Logical NOT (!)
        System.out.println("!A: " + (!A)); // false
    }
}
