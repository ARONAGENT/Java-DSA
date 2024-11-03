package O9Arrays2D;

import java.util.Scanner;
//A 2D array (also known as a matrix) is an array of arrays, where each element is itself an array.
//It is used to represent tabular data in rows and columns. 
//In a 2D array, elements are accessed using two indices: one for the row and one for the column.

public class Create2dArrays {
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
}
}
