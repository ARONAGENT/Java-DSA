package functional_interface.typesof_functional_interfaces;

import java.util.function.Predicate;
/**
 * Represents a predicate (boolean-valued function) of one argument.
 * This is a functional interface whose functional method is test(Object).
 */

// Predicate -> A function that take one input but return only boolean value
// method use in this called -> test();
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate=(String pass)->{
          if(pass.equals("AronAgent")){
              return true;
          }
          else {
              return false;
          }
        };

        System.out.println(predicate.test("rohan"));
    }
}
