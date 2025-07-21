package arrays.twodimentionalarrays;

import java.util.Scanner;

public class TransposeOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
       int cols=scanner.nextInt();

        int[][] arr=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                System.out.print("Enter value at row "+i+" and column "+j+" :");
                arr[i][j]=scanner.nextInt();
            }
        }

        System.out.println("your matrix");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose Of matrix");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
