package hashing;

import java.util.Scanner;

public class Optimized_HashingApproach_Integers {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();

        int[] nums=new int[n];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=scanner.nextInt();
        }

        // Find max value
        int maxVal = 0;
        for (int val : nums) {
            if (val > maxVal) maxVal = val;
        }

        // precomputing
        int[] hash=new int[maxVal+1];
        for (int i = 0; i <hash.length ; i++) {
            hash[nums[i]]+=1;
        }

        int q =scanner.nextInt();
        while(q>=1){
            int num=scanner.nextInt();
            System.out.println(hash[num]);
            q--;
        }

    }
}
