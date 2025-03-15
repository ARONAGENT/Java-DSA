package arrays.twodimentionalarrays;

import java.util.Scanner;

public class CalculateTransposeOfMatrix {
    /*
     * The transpose of a matrix is a new matrix created by swapping the rows and columns of the original matrix.
     * If the original matrix is of size m x n, then its transpose will be of size n x m.
     * The element at position [i][j] in the original matrix will be at position [j][i] in the transposed matrix.
     * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input from users for rows and column

        System.out.print("Enter no of Rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter no of Columns : ");
        int cols=sc.nextInt();
        int[][] matrix =new int[rows][cols];
        // add numbers in 2D array

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                System.out.print("Enter value at row "+i+" and column "+j+" :");
                matrix[i][j]=sc.nextInt();
            }
        }
        //print 2D array
        System.out.println("Your matrix is :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // calculate Transpose of that matrix
        System.out.println("Transpose of given Matrix is :");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
