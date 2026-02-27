package qspiders;

import java.util.Scanner;

public class LoopExample6 {

    // User Input the number Calculate The Length of Number
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n =scanner.nextInt();
        int cnt=0;
        for (int i = n; i !=0 ; i/=10) {
            cnt++;
        }
        System.out.print("Length of number "+n+" is "+cnt);
    }
}
