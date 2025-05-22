package functional_interface.typesof_functional_interfaces;

import java.util.function.Function;
/**
 * Represents a function that accepts one argument and produces a result.
 * This is a functional interface whose functional method is apply(Object).
 */

// Function -> A function that take input and return something
// method use in this called -> apply(...);
public class FunctionDemo {
    public static void main(String[] args) {
        //Function<Integer,String > function=(Integer num) -> "Square of "+num+" is "+(num*num);
        // or
        Function<Integer,String > function=(Integer num) ->{
            return "Square of "+num+" is "+(num*num);
        };

        System.out.println(function.apply(78));
    }
}
