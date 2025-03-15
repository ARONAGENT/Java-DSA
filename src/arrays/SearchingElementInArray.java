package arrays;

import java.util.Scanner;

public class SearchingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Define the array size and initialize the array
        System.out.println("Enter size of array:");
        int no = sc.nextInt();
        int numbers[] = new int[no];

        // Step 2: Add elements to the array from user input
        for (int i = 0; i < no; i++) {
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }

        // Step 3: Print all elements in the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Step 4: Search for a specific element in the array
        System.out.print("Enter a number to search for: ");
        int searchNo = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (searchNo == numbers[i]) {
                System.out.println("Number " + searchNo + " found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number " + searchNo + " not found in the array.");
        }

        // Linear search:
        // Linear search is a simple searching algorithm used to find an element in an array.
        // It sequentially checks each element until a match is found or the entire array has been searched.
        // Linear search has a time complexity of O(n), where 'n' is the number of elements.
    }
}
