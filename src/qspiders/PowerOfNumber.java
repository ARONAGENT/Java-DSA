package qspiders;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a number : ");
        double num=scanner.nextDouble();

        System.out.print("Enter a power : ");
        double power=scanner.nextDouble();

        if(power<0){
            power*=-1;
            num= 1/num;
        }
        double op=1;
        for (int i = 1; i <=power ; i++) {
            op=op*num;
        }

        System.out.println("Math of Power : "+Math.pow(num,power));
        System.out.println("Our answer : "+op);
    }
}
