package operators;

/*
 * Relational Operators:
 * - Used to compare two values.
 * - Return boolean results (true or false).
 */

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20;

        // Equal (==)
        System.out.println("x == y: " + (x == y)); // false

        // Greater than or Equal (>=)
        System.out.println("x >= y: " + (x >= y)); // false

        // Less than or Equal (<=)
        System.out.println("x <= y: " + (x <= y)); // true

        // Greater than (>)
        System.out.println("x > y: " + (x > y)); // false

        // Less than (<)
        System.out.println("x < y: " + (x < y)); // true

        // Not Equal (!=)
        System.out.println("x != y: " + (x != y)); // true
    }
}
