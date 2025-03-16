package arrays.twodimentionalarrays;

import java.util.Arrays;
import java.util.Scanner;
/*
define jagged array ->
Explanation of the code:
        A jagged array is declared, where each row has a different number of columns.
        Memory is allocated dynamically for each row.
        The program takes user input to populate the array.
        The program prints the jagged array in a structured format. */
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Declaring a jagged array with 3 rows, but columns of different lengths
        int[][] arr = new int[3][];
        arr[0] = new int[2]; // First row has 2 columns
        arr[1] = new int[3]; // Second row has 3 columns
        arr[2] = new int[4]; // Third row has 4 columns

        // Taking user input to fill the jagged array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length + "-----------------------------------------------------");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt(); // Reading input for each element
            }
        }

        // Displaying the elements of the jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // Printing each element
            }
            System.out.println(); // Moving to the next row
        }
    }
}
