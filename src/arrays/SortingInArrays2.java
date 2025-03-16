package arrays;

// Class to demonstrate sorting in arrays (Selection Sort)
/*
* Explanation of the Code:
The array is initialized with some random numbers.
A nested loop is used to perform Selection Sort:
The inner loop checks for a smaller element and swaps it with the current element.
This process repeats for all elements to ensure sorting.
Sorting condition can be changed:
if (arr[i] > arr[j]) → Sorts in ascending order.
if (arr[i] < arr[j]) → Sorts in descending order.
The sorted array is printed using an enhanced for-loop.
* */
public class SortingInArrays2 {
    public static void main(String[] args) {
        // Initializing an integer array
        int[] arr = {12, 34, 2, 37, 89, 99, 0, 6};

        int i, j, temp;

        // Implementing a simple sorting algorithm (Selection Sort)
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                // Swap condition for sorting in ascending order (use '<' for descending order)
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // The above sorting approach is also called Selection Sort.

        // Printing the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
