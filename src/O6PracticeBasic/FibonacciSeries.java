package O6PracticeBasic;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter No of Times : ");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	System.out.print(a+" ");
	for(int i=2;i<=n;i++) {
		System.out.print(b+" ");
		int temp=b;
		b=a+b;
		a=temp;
	}
	
	
}
}
