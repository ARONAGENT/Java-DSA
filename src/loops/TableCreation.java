package loops;

import java.util.Scanner;

public class TableCreation {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter No :");
	int no=sc.nextInt();
	System.out.println("Table of "+no+" is Given By :");
	int table=0;
	for(int i=1;i<=10;i++) {
		table=no*i;
		System.out.println(no+" * "+i+" = "+table);
	}
}
}
