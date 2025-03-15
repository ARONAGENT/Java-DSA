package arrays;

public class SecondWayCreatingArray {
    public static void main(String[] args) {
        // This program demonstrates how to initialize an array directly with values in Java.
        // Here, we create an array of Strings and assign values at the time of declaration.
        // The data type of all elements in an array must be the same.
        // In Java, you can create arrays of various data types like int, float, String, boolean, etc.

        String[] names = {"Rohan", "Rahul", "Kartik", "Umesh", "Yash", "Atharva", "Aryan", "Om"};

        // Display each element with its index
        for (int i = 0; i < names.length; i++) {
            System.out.println("For index " + i + ", the name is " + names[i]);
        }
        // Optimizing way of applying for Loop:
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
