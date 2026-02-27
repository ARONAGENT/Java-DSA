package qspiders;

import java.util.Scanner;

public class LoopExample14 {
    // Number to Words
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
            int fd=i/div;
            String ans =switch (fd){
                case 1 -> "One ";
                case 2 -> "Two ";
                case 3 -> "Three ";
                case 4 -> "Four ";
                case 5 -> "Five ";
                case 6 -> "Six ";
                case 7 -> "Seven ";
                case 8 -> "Eight ";
                case 9 -> "Nine ";
                case 0 -> "Zero ";
                default -> "";
            };
            System.out.print(ans);
        }
    }
}
