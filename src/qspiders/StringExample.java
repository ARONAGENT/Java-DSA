package qspiders;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);
        System.out.print("\n Enter a String : ");
        String str=scanner.nextLine();

        System.out.println();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            System.out.print(ch);
            Thread.sleep(200);
        }
        System.out.println();
    }
}
