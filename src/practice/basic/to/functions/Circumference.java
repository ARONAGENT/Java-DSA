package practice.basic.to.functions;

import java.util.Scanner;

public class Circumference {
public static double circum(int a) {
	return 2*3.14*a;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter radius : ");
	int a=sc.nextInt();
	System.out.println("Circumference is "+ circum(a));
	
}
}
