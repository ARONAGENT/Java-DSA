package qspiders;

import java.util.Scanner;

public class LoopExample3 {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num= scanner.nextInt();

        int esum=0;
        int osum=0;
        for (int i = num; i >0 ; i=i/10) {
            int ld= i%10;
            if(i%2==0) esum+=ld;
            else osum+=ld;
        }
        System.out.println("sum of even digits : "+esum);
        System.out.println("sum of odd digits : "+osum);

    }
}
