package functions;

import java.util.Scanner;

public class Factorial {
public static int calFactorial(int a) {
	int Fact=1;
	for(int i=a;i>=1;i--) {
		Fact=Fact*i;
	}
	 return Fact;
}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number :");
	int a=sc.nextInt();
	System.out.println("Factorial of "+a+" is "+calFactorial(a));
}
}
