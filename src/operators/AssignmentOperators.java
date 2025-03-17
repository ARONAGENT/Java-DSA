package operators;

/*
 * Assignment Operators:
 * - Used to assign values to variables.
 * - Shorthand for arithmetic operations.
 */

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Addition Assignment (+=)
        a += b; // a = a + b
        System.out.println("a += b: " + a); // 15

        // Subtraction Assignment (-=)
        a -= b; // a = a - b
        System.out.println("a -= b: " + a); // 10

        // Multiplication Assignment (*=)
        a *= b; // a = a * b
        System.out.println("a *= b: " + a); // 50

        // Division Assignment (/=)
        a /= b; // a = a / b
        System.out.println("a /= b: " + a); // 10

        // Modulus Assignment (%=)
        a %= b; // a = a % b
        System.out.println("a %= b: " + a); // 0
    }
}
