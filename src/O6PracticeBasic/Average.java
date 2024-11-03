package O6PracticeBasic;

import java.util.Scanner;

public class Average {
	public static int avgNum(int a,int b,int c) {
		return (a+b+c)/3;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter first No :");
		int a=sc.nextInt();
		System.out.print("Enter Second No :");
		int b=sc.nextInt();
		System.out.print("Enter Third No :");
		int c=sc.nextInt();
		System.out.println("Average of three no are "+avgNum(a,b,c));
	}
}
