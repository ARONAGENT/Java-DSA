package arrays.twodimentionalarrays;

import java.util.Scanner;
//A 2D array (also known as a matrix) is an array of arrays, where each element is itself an array.
//It is used to represent tabular data in rows and columns.
//In a 2D array, elements are accessed using two indices: one for the row and one for the column.
public class Creating_2D_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input from users for rows and column
        System.out.print("Enter No of Rows :");
        int rows=sc.nextInt();
        System.out.print("Enter No of Colums :");
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];
        // add numbers in 2D array
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print("Enter Number for row "+i+" and column "+j+" :");
                numbers[i][j]=sc.nextInt();
            }
        }
        // print 2D Array :
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        // Second Method of creating 2d array

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }


        int[][] matrix2 = new int[3][];
        matrix2[0] = new int[]{1, 2, 3};
        matrix2[1] = new int[]{4, 5, 6};
        matrix2[2] = new int[]{7, 8, 9};
    }
}
