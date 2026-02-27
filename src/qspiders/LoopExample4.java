package qspiders;

import java.util.Scanner;

public class LoopExample4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num= scanner.nextInt();
        int len=0;
        for (int i = num; i >0 ; i/=10) {
            len++;
        }
        System.out.println("Length of Number : "+len);

        int div=1;
        for (int i = 1; i <=len ; i++) {
            div=div*10;
        }
        System.out.println("divisor is "+div);


        for(int i=num;i!=0;i%=div){
            div/=10;
            int fd= i/div;
            System.out.print(fd+"_");
        }
    }
}
