package sorting_algos;

import java.util.Arrays;

public class Insertion_sort {
    static void insertion_sort(int[] nums){
        int temp=0;
        for (int i = 0; i <nums.length ; i++) {
            int j=i;
            while (j>0 && nums[j-1]>nums[j]){
                temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
                System.out.println("runs....");
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertion_sort(arr);
    }
}
