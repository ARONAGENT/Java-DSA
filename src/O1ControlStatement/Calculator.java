package O1ControlStatement;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter First no :");
	int x=sc.nextInt();
	System.out.println("Enter Second no");
	int y=sc.nextInt();
	System.out.println("Enter Case "
			+ "Addition 1"
			+ " subtraction 2"
			+ " multiplication 3"
			+ " division 4");
	int operation=sc.nextInt();
	
	switch (operation){
	case 1:
		operation=x+y;
		System.out.println("Addition is : "+operation);
		break;
	case 2:
		operation=x-y;
		System.out.println("Subtraction is :"+operation);
		break;
	case 3:operation=x*y;
	System.out.println("Multiplication is :"+operation);
	break;
	case 4:operation=x/y;
	System.out.println("Division is :"+operation);
	break;
	case 5:operation=x%y;
	System.out.println("Modulo is :"+operation);
	break;
	default:System.out.println("invalid input");
	}
}
}
