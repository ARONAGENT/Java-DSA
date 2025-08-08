package sorting_algos;

import java.util.Arrays;

public class BubbleSort {
    static void bubble_sort(int[] nums){
        int temp=0;
        for (int i = nums.length-1; i >=0 ; i--) {
            for (int j = 0; j <=i-1 ; j++) {
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    static void bubble_sort_optimized_for_best_case(int[] nums){
        int temp=0;
        for (int i = nums.length-1; i >=0 ; i--) {
            int sorted=0;
            for (int j = 0; j <=i-1 ; j++) {
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    sorted=1;
                }
            }
            if (sorted==0){
                break;
            }
            System.out.println("sorting");
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        int[] nums2={1,2,3,4,5};
        bubble_sort_optimized_for_best_case(nums);
        System.out.println("======================");
        bubble_sort_optimized_for_best_case(nums2);
    }

}
