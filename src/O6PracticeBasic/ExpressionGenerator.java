package O6PracticeBasic;

import java.util.Scanner;

public class ExpressionGenerator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int var=0;
	System.out.print("Enter x :");
	int x=sc.nextInt();
	System.out.print("Enter n :");
	int y=sc.nextInt();
	for(int i=1;i<=y;i++) {
		var=x*i;
	}
	System.out.println("Expression answer of "+x+" ^ "+y+" is "+var);
	
}
}
