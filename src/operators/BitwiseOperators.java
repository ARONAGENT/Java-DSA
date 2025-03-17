package operators;

/*
 * Bitwise Operators:
 * - Works at the bit level (0s and 1s).
 *
 * Truth Table for AND, OR, XOR:
 * ---------------------------------
 * A   B   A & B   A | B   A ^ B
 * ---------------------------------
 * 0   0    0       0       0
 * 0   1    0       1       1
 * 1   0    0       1       1
 * 1   1    1       1       0
 */

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3; // Binary: a = 101, b = 011

        // Bitwise AND (&)
        System.out.println("a & b: " + (a & b)); // 101 & 011 = 001 (1)

        // Bitwise OR (|)
        System.out.println("a | b: " + (a | b)); // 101 | 011 = 111 (7)

        // Bitwise XOR (^)
        System.out.println("a ^ b: " + (a ^ b)); // 101 ^ 011 = 110 (6)

        // Bitwise Complement (~)
        System.out.println("~a: " + (~a)); // Inverts bits

        // Left Shift (<<)
        System.out.println("a << 1: " + (a << 1)); // 101 << 1 = 1010 (10)

        // Right Shift (>>)
        System.out.println("a >> 1: " + (a >> 1)); // 101 >> 1 = 10 (2)
    }
}
