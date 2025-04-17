package oops.abstract_methods;
// Base Class
/*
Abstract Methods
Abstract methods don’t have any block of code; they only have the method signature.
If you're writing an abstract method, then the class must be declared as abstract.
Another class inherits this abstract class and provides the method body using the same signature.
The method is then called using the object of the subclass (not the abstract class, as it cannot be instantiated).
* */
public abstract class Products {
    // normal method
    public void welcome(){
        System.out.println("Welcome to Product Entity");
    }
    public abstract void prodNm(String name); // abstract method
}
