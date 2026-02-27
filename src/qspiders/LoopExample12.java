package qspiders;

import java.util.Scanner;

public class LoopExample12 {
    // create a Divisor Based on Length
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        int cnt=0;
        for (int i = num; i !=0; i/=10) {
            cnt++;
        }

        int div=1;
        for (int i = 1; i <=cnt ; i++) {
            div=div*10;
        }

        System.out.println("The Number is "+num);
        System.out.println("The Length of Number is "+cnt);
        System.out.println("The Dividend of number is "+div);
    }
}
