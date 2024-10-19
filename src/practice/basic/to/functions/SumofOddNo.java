package practice.basic.to.functions;

import java.util.Scanner;

public class SumofOddNo {
public static int oddNo(int n) {
	int odd=0;
	for(int i=1;i<=n;i++) {
		if(i%2 !=0) {
		odd=odd+i;	
		}
	}
	return odd;
}
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter a No");
	int num=sc.nextInt();
	System.out.println("Sum of all odd num is "+ oddNo(num));
	}
}
