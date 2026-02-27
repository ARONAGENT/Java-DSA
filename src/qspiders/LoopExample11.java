package qspiders;

public class LoopExample11 {

    // Products of Digits
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        int n = new java.util.Scanner(System.in).nextInt();

        int prod=1;
        for (int i = n; i !=0 ; i/=10) {
            prod*= (i%10);
        }

        System.out.println("Product of Digits "+n+" is "+prod);

    }
}
