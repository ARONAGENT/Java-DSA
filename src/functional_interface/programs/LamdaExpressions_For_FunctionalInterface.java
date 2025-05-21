package functional_interface.programs;

// Importing the functional interface 'Banking'
import functional_interface.interfaces.Banking;

/*
 * ✅ Lambda Expression with Functional Interface
 *
 * Format of Lambda Expression:
 *   InterfaceName obj = (parameter) -> {
 *       // method body
 *   };
 *
 * - The '->' symbol is called the **Lambda Operator** (Arrow Operator).
 * - It is used to separate the parameters and the body of the lambda.
 * - Works only with Functional Interfaces (interface with ONE abstract method).
 */

public class LamdaExpressions_For_FunctionalInterface {
    public static void main(String[] args) {

        /*
         * 🔹 Lambda expression implementation for Functional Interface 'Banking'
         *
         * Here, we do NOT use any class or anonymous class to implement the interface.
         * Instead, we directly pass the logic (method body) using a Lambda expression.
         *
         * Functional interface method in 'Banking':
         *     String calInterest(double balance);
         *
         * So, the lambda takes 'double balance' as input and returns a String.
         */

        Banking banking = (double balance) -> {
            // Logic to calculate 5% interest on the balance
            double interest = balance * 5 / 100;

            // Return the result as a formatted string
            return "Interest of ICICI bank for balance :" + balance + " is " + interest;
        };

        /*
         * 🔹 Now we call the method calInterest() via the lambda expression
         *
         * Internally, it behaves like the overridden method in a class
         * But here, it's lightweight and inline (no need to create a separate class)
         */
        String value = banking.calInterest(678900);

        // Output the result
        System.out.println(value);
    }
}
