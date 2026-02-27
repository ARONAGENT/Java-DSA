package qspiders;

public class LoopExample8 {
    // Sum of Odd and Even Digits

    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        int n= new java.util.Scanner(System.in).nextInt();
        int esum=0,osum=0;
        for (int i = n; i !=0 ; i/=10) {
            if(i%2==0) esum+=(i%10);
            else osum+=(i%10);
        }
        System.out.println("Sum of Even Digits : "+esum);
        System.out.println("Sum of Odd Digits : "+osum);

    }
}
