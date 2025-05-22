package functional_interface.typesof_functional_interfaces;

import java.util.function.Supplier;
/**
 * Represents a supplier of results.
 * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
 * This is a functional interface whose functional method is get().
 */

// Supplier -> A function that doesn't take input but return something
    // method use in this called -> get();
    public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> supplier=()->{
            System.out.println("Welcome to Suppplier Class");
            return "hello this is Supplier Functional Interface...";
        };

        System.out.println(supplier.get());

    }


}
