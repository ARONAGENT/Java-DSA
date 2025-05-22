package functional_interface.typesof_functional_interfaces;

import java.util.function.Consumer;
/**
 * Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces,
 * Consumer is expected to operate via side-effects.
 * This is a functional interface whose functional method is accept(Object).
 */

// Consumer -> A function that take input but return nothing
// method use in this called -> accept(..);
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer=(Integer num) ->{
            int sq=num*num;
            System.out.println("Square of "+num+" is "+sq);
        };

        consumer.accept(6);
    }
}
