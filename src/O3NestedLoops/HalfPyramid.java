package O3NestedLoops;

import java.util.Scanner;

public class HalfPyramid {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter No of rows of half pyramid : ");
	int n=sc.nextInt();
	System.out.println("Your Pyramid of Rows "+n+" will be :");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
