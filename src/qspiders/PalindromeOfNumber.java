package qspiders;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {

        Scanner  scanner=new Scanner(System.in);
        System.out.print("Enter a Number to Reverse : ");
        int num=scanner.nextInt();
        int rev=0;
        for (int i = num; i !=0 ; i/=10) {
            int ld=i%10;
            rev=rev*10+ld;
        }
        System.out.print((rev==num)? num+" Is a Palindrome":num+" Is not a Palindrome");
    }
}
