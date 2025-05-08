package functional_interface.programs;

// Importing the SBI class which implements the Banking interface
import functional_interface.classes.SBI;

/*
 * ✅ This program shows how we used to implement interfaces traditionally
 *    before using Functional Interfaces and Lambda Expressions.
 *
 * 🔹 Here, SBI is a normal class that implements the interface 'Banking'.
 * 🔹 We create an object of SBI and call the implemented method.
 */

public class Without_FunctionalInterface {
    public static void main(String[] args) {

        // Creating object of SBI class
        SBI sbi = new SBI();

        // Calling the calInterest() method using the object
        String value = sbi.calInterest(450000);

        // Printing the returned interest string
        System.out.println(value);
    }
}
