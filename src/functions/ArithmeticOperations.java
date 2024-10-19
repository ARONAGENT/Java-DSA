package functions;

import java.util.Scanner;

public class ArithmeticOperations {
public static int calSum(int a ,int b) {
	return a+b;
}
public static int calSub(int a,int b) {
	return a-b;
}
public static int calMul(int a , int b) {
	return a*b;
}
public static int calDiv(int a ,int b) {
	return a/b;
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter First No :");
	int a=sc.nextInt();
	System.out.print("Enter Second No :");
	int b=sc.nextInt();
	System.out.println("Addition is "+calSum(a,b));
	System.out.println("Subtraction is "+calSub(a,b));
	System.out.println("Mutiplication is "+calMul(a,b));
	System.out.println("Division is "+calDiv(a,b));
}
}
