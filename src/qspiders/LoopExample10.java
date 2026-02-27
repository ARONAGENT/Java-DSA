package qspiders;

import java.util.Scanner;

public class LoopExample10 {

    // Average of Even and Odd Digits
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=scanner.nextInt();
        int ecnt=0,esum=0,ocnt=0,osum=0;

        for (int i = n; i !=0 ; i/=10 ) {
            if(i%2==0){
                esum+=(i%10);
                ecnt++;
            }
            else{
                osum+=(i%10);
                ocnt++;
            }
        }
        System.out.println("Average of even Number is "+(esum/ecnt));
        System.out.println("Average of odd Number is "+(osum/ocnt));


    }
}
