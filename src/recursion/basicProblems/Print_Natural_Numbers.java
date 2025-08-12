package recursion.basicProblems;

import java.util.Scanner;

public class Print_Natural_Numbers {
    static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt();
    static int i=0;
    static void f1(){
        if(i==n){
            return;
        }
        System.out.println(i+1);
        i++;
        f1();
    }

    public static void main(String[] args) {
        f1();
    }
}
