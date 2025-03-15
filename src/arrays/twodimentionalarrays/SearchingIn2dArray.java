package arrays.twodimentionalarrays;

import java.util.Scanner;

public class SearchingIn2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter no of columns : ");
        int cols=sc.nextInt();

        int matrix[][]=new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print("Enter value at row "+i+" and column "+j+" :");
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("Enter a number to search in  2D array :");
        int no=sc.nextInt();
        boolean value=true;

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(no==matrix[i][j]) {
                    System.out.print("Your number "+no+" found at row no "+i+" and column no "+j);
                    value=false;
                }
            }
        }
        if(value) {
            System.out.print("Your number not found ");
        }
    }
}
