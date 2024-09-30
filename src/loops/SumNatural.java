package loops;

import java.util.Scanner;

public class SumNatural {
public static void main(String[] args) {
	int no;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a No :");
	no=sc.nextInt();
	int sum=0;
	for(int i=0;i<=no;i++) {
	     	sum=sum+i;
	     	
	}
	System.out.println("Sum of First "+no+" Natural no is "+sum);
}
}
