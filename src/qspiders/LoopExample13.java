package qspiders;

import java.util.Scanner;

public class LoopExample13 {
    // divisor Side Printing
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

        for (int i = num; i !=0 ; i%=div) {
            div/=10;
            int firstDigit= i/div;
            System.out.print(firstDigit+" ");
        }

    }
}
