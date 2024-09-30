package com.dsa.ControlStatement;

import java.util.Scanner;

public class NumberCheck {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter First No :");
	int a=sc.nextInt();
	System.out.print("Enter Second No :");
	int b=sc.nextInt();
    if(a==b) {
    	System.out.println("a and b are equal");
    }else if(a>b){
    	System.out.println("a is greater than b");
    }else {
    	System.out.println("b is greater than a");
    }
}
}
