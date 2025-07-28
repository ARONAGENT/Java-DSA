package wrapperClasses;

public class IntegerClass {
    public static void main(String[] args) {
        // 🔹 1. Manual Boxing (Converting primitive to object)
        int a = 10;
        Integer boxedA = Integer.valueOf(a); // Boxing
        System.out.println("Manual Boxing: " + boxedA);

        // 🔹 2. Manual Unboxing (Converting object to primitive)
        Integer b = new Integer(20);
        int unboxedB = b.intValue();         // Unboxing
        System.out.println("Manual Unboxing: " + unboxedB);

        // 🔹 3. Autoboxing (Automatically done by Java)
        int c = 30;
        Integer autoBoxed = c;               // Autoboxing
        System.out.println("Autoboxed: " + autoBoxed);

        // 🔹 4. Auto-unboxing (Automatically done by Java)
        Integer d = 40;
        int autoUnboxed = d;                 // Auto-unboxing
        System.out.println("Auto-unboxed: " + autoUnboxed);

    }
}

/*
* Autoboxing and unboxing are features introduced in Java 5
* that facilitate the automatic conversion between primitive data types and their corresponding wrapper class objects.
Autoboxing:
Autoboxing refers to the automatic conversion of a primitive data type (like int, char, double, etc.)
* into an object of its corresponding wrapper class (e.g., Integer, Character, Double).
* This conversion happens automatically when a primitive value is used in a context
*  where an object of the wrapper class is expected.*/