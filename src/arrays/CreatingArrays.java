package arrays;

import java.util.Scanner;
// This program demonstrates how to create an integer array in Java.
// It takes the array size as input, then populates the array with values entered by the user.
// After storing the values, the program retrieves and prints each element by iterating over the array.
// Note:
// - In Java, arrays are automatically initialized with default values (0 for int, 0.0 for float, "" for String, and false for boolean).
// - In C++, however, explicit initialization is required, as uninitialized arrays contain garbage values.

//--------------------------------------------------------------------------------------------------------------------------------------------------
//Arrays are data structures used to store multiple values of the same data type in a single variable.
//Each value in an array can be accessed using an index, with indexing starting from 0.
//Arrays in Java have a fixed size, meaning the number of elements is defined upon creation and cannot be changed later.
public class CreatingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");

        int size = sc.nextInt();
        int marks[] = new int[size];
        // we can create also like that main focus how to create array
        // int[] marks=new int[size];

        // Populate the array with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter marks for index " + i + ": ");
            marks[i] = sc.nextInt();
        }

        // Print the array values in a readable format
        System.out.println("Array elements:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
