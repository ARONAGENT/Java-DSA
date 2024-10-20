package O6PracticeBasic;

import java.util.Scanner;

public class NumberCheckerCounter {
public static void main(String[] args) {
	int pcount=0;
	int ncount=0;
	int zcount=0;
	int choice=1;
	Scanner sc=new Scanner(System.in);
	while(choice!=0) {
	System.out.print("Enter a number :");
	int n=sc.nextInt();
	if(n==0) {
		
		zcount=zcount+1;
	}
	else if(n>=0) {
		pcount=pcount+1;
	}
	else {
		ncount=ncount+1;
	}
	System.out.print("Do u want to continue (Type 1 for continue or type 0 for stop) :");
	choice=sc.nextInt();
	}
	System.out.println("Positive Counts :"+pcount);
	System.out.println("Negative Counts :"+ncount);
	System.out.println("Zero Counts :"+zcount);
	
}
}
