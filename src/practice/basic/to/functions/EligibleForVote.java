package practice.basic.to.functions;

import java.util.Scanner;

public class EligibleForVote {
public static  void voteChecker(int a) {
	if(a>18) {
		System.out.println("You are Eligible for vote");
	}
	else {
		System.out.println("You are not Eligible for vote");
	}
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Age :");
	int a=sc.nextInt();
	voteChecker(a);
}
}
