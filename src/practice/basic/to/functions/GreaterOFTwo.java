package practice.basic.to.functions;

import java.util.Scanner;

public class GreaterOFTwo {
public static void greaterNo(int a,int b) {
	if(a>b) {
		System.out.println("Greater No is "+a);
	}
	else {
		System.out.println("Greater No is "+b);
	}
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter First No :");
	int a=sc.nextInt();
	System.out.print("Enter Second No :");
	int b=sc.nextInt();
	greaterNo(a,b);
}
}
