package qspiders;

import java.util.Scanner;

public class LoopExample7 {
    // User input Calculate Sum of Digits

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num =scanner.nextInt();
        int sum=0;
        for (int i = num; i !=0 ; i/=10) {
            sum+= (i%10);
        }

        System.out.println("Sum of Digits Of Number "+num+" is "+sum);
    }
}
