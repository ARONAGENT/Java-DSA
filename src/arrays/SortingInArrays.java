package arrays;

import java.util.Scanner;

public class SortingInArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("Enter a Number :");
            numbers[i]=sc.nextInt();
        }
        System.out.print("Your Array is ");
        for(int i=0;i<size;i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        boolean IfAscending=true;

        for(int i=0;i<numbers.length-1;i++) {
            if(numbers[i]>numbers[i+1]) {
                IfAscending=false;
            }
        }

        if(IfAscending) {
            System.out.println("The order of array is in Ascending order ");
        }
        else {
            System.out.println("The order of array is in Descending order ");
        }

        //Note that the program condition is that that the array must be in order (ascending or descending)
        // the program is basically to check whether the array is ascending or descending order
    }
}
