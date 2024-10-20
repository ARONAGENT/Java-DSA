package O5Functions;

import java.util.Scanner;

public class SumCalculator {
public static int calSum(int a,int b) {
	return a+b;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter First No :");
	int a=sc.nextInt();
	System.out.print("Enter Second No :");
	int b=sc.nextInt();
	System.out.println("Sum of "+ a +" and "+ b +" is "+ calSum(a,b));
}
}
