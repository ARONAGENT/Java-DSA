package sorting_algos;

import java.util.Arrays;

public class SelectionSort {
    static void selection_sort(int[] nums){
        int temp=0;
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i; j <nums.length ; j++) {
                if(nums[i]>nums[j]){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums={13,46,24,52,220,9};
        selection_sort(nums);
    }
}
