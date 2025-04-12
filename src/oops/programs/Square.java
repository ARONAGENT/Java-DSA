package oops.programs;

import oops.classes.Calculator;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        int a,b;
        String Desc;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        a=scanner.nextInt();
        System.out.println("Enter Second Number : ");
        b=scanner.nextInt();

        Calculator calculator=new Calculator();
        calculator.calcSquare(a,b,"This is Public Data");
        System.out.println("Public Data : "+calculator.Desc);
        scanner.close();
    }
}
