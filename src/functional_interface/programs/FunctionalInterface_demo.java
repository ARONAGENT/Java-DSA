// FunctionalInterface_demo.java
// Demonstrates how functional interfaces work in Java using an anonymous class implementation

package functional_interface.programs;

import functional_interface.interfaces.Banking;
// with the help of anonymous class ->
public class FunctionalInterface_demo {
    public static void main(String[] args) {

        // -------------------- THEORETICAL BACKGROUND --------------------
        /*
         * A Functional Interface in Java:
         * - Is an interface that contains only one abstract method.
         * - Can have multiple default or static methods (but only one abstract method).
         * - Is eligible to be used with lambda expressions or anonymous classes.
         * - Annotated with @FunctionalInterface for clarity and compiler-level validation.
         *
         * Example:
         *           interface Banking {
         *     String calInterest(double balance);
         * }
         */

        // -------------------- EXPLANATION --------------------
        /*
         * Previously, we might have created a separate class like Sbi that implements Banking interface:
         *
         * class Sbi implements Banking {
         *     public String calInterest(double balance) {
         *         return ...
         *     }
         * }
         * Banking banking = new Sbi();
         *
         * BUT in this program, instead of creating a separate Sbi class,
         * we are using an **anonymous class** to provide the implementation of the method on the spot.
         *
         * Benefits:
         * - Saves code when interface is used only once.
         * - Enhances readability for single-use logic.
         * - This is one of the main uses of functional interfaces.
         */

        // -------------------- PROGRAM LOGIC --------------------
        // Creating an object of Banking interface using anonymous class
        Banking banking = new Banking() {
            @Override
            public String calInterest(double balance) {
                double interest = balance * 7 / 100; // Calculating 7% interest
                return "Interest of HDFC Bank For balance :" + balance + " is " + interest;
            }
        };

        // Calling the calInterest method with balance of 350000
        String value = banking.calInterest(350000);

        // Displaying the interest returned by the method
        System.out.println(value);
    }
}
