package O3NestedLoops;

import java.util.Scanner;

public class SolidRectangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter No of rows :");
	int n=sc.nextInt();

	System.out.print("Enter No of column :");
	int m=sc.nextInt();

	//outer loop
	for(int i=1;i<=n;i++) {
		// inner loop
		for(int j=1;j<=m;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
