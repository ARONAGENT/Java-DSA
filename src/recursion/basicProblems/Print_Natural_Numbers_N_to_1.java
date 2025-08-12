package recursion.basicProblems;

import java.util.Scanner;

public class Print_Natural_Numbers_N_to_1 {
     static void f3(int i, int n){
        if(i<1) return;
        System.out.println(i);
        f3(i-1,n);
    }
    public static void main(String[] args) {

        int i=3;
        int n=3;
        f3(i,n);

    }
}
