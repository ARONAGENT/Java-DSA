package qspiders;

import java.util.Scanner;

public class LoopExample5 {

    // User Input Reverse The Number
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=scanner.nextInt();
        for (int i = n; i >0 ; i/=10) {
            System.out.print((i%10)+" ");
        }
    }
}
