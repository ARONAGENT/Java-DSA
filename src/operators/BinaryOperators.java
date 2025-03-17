package operators;

/*
 * Binary Operators:
 * - Require two operands (e.g., `a + b`).
 * - Used for arithmetic calculations.
 */

public class BinaryOperators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Addition (+)
        System.out.println("Addition: " + (a + b)); // 10 + 3 = 13

        // Subtraction (-)
        System.out.println("Subtraction: " + (a - b)); // 10 - 3 = 7

        // Multiplication (*)
        System.out.println("Multiplication: " + (a * b)); // 10 * 3 = 30

        // Division (/)
        System.out.println("Division: " + (a / b)); // 10 / 3 = 3 (integer division)

        // Modulus (%)
        System.out.println("Modulus: " + (a % b)); // 10 % 3 = 1 (remainder)
    }
}
