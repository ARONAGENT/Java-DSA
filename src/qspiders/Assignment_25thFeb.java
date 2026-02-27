package qspiders;

import java.util.Scanner;

public class Assignment_25thFeb {
    public static void main(String[] args) {
        // A-Z
        for (char ch = 'A'; ch <='Z' ; ch++) {
            System.out.print(ch+" ");
        }

        System.out.println();
        // z-a
        for (char ch = 'z'; ch >='a' ; ch--) {
            System.out.print(ch+" ");
        }

        System.out.println();
        // Aa,Bb,Cc,....
        for (char ch1 = 'A' ,ch2='a'; ch1<='Z' ; ch1++,ch2++) {
            System.out.print(ch1+""+ch2+" ");
        }

        System.out.println();

        // Az,By,Cx...
        for (char ch1 = 'A' ,ch2='z'; ch1<='Z' ; ch1++,ch2--) {
            System.out.print(ch1+""+ch2+" ");
        }

        System.out.println();

        // A-65,B-66,C-67...
        for (char ch1 = 'A'; ch1<='Z' ; ch1++) {
            System.out.print(ch1+" - "+(ch1+0)+",");
        }

        System.out.println();
        // z-122,y-121,x-120...
        for (char ch1 = 'z'; ch1>='a' ; ch1--) {
            System.out.print(ch1+" - "+(ch1+0)+",");
        }

        System.out.println();
        // 0 to 9
        for (char ch1 = '0'; ch1<='9' ; ch1++) {
            System.out.print(ch1+" - "+(ch1+0)+",");
        }

        System.out.println();
        // 1 to 100
        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
        // 100 to 50
        for (int i = 100; i >=50 ; i--) {
            System.out.print(i+" ");
        }

        System.out.println();
        // 100 to 1 odd numbers
        for (int i = 100; i >=1 ; i--) {
            if(i%2!=0)
                System.out.print(i+" ");
        }

        System.out.println();
        // 1 to 100
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0)
                System.out.print(i+" ");
        }

        System.out.println();
        int dist=1;
        for (char i = 'A'; i <='Z' ; i+=dist) {
            System.out.print(i+" ");
            dist++;
        }

        System.out.println();

        // user input and print
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Start : ");
        int starts=scanner.nextInt();
        System.out.println("Enter Ends : ");
        int ends=scanner.nextInt();

        if(starts<ends) {
            for (int i = starts; i <= ends; i++) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        // A - Consonant
        for (char ch = 'A'; ch <='Z' ; ch++) {
        switch (ch){
            case 'A','E','I','O','U':{
                System.out.println(ch+" is a  Vowel");
                break;
            }
            default:{
                System.out.println(ch+" is a Consonant");
                break;
            }
        }
        }

    }
}
