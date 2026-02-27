package qspiders;

import java.util.Scanner;

public class LoopExample9 {

    // find the average of Digits
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=scanner.nextInt();
        int cnt=0;
        int sum=0;
        for (int i = n; i !=0 ; i/=10, cnt++) {
            sum+=(i%10);
        }
        System.out.println("Average of Number is "+(sum/cnt));

    }
}
