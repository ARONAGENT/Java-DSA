package leetcode;

import java.util.Arrays;
/*
The Dutch National Flag algorithm is a sorting technique
used when you have only three distinct values (e.g., 0, 1, 2 or "red", "white", "blue").

It uses three pointers:

low → boundary for the smallest group (start of array)
mid → current element being checked
high → boundary for the largest group (end of array)

Steps:

If arr[mid] is the smallest value → swap with arr[low], increment low & mid.
If arr[mid] is the middle value → just move mid forward.
If arr[mid] is the largest value → swap with arr[high], decrement high (don’t increment mid yet).

Time complexity: O(n)
Space complexity: O(1) (in-place)
* */
public class Sort_Colors_Medium_75 {
    static public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }

    static public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};

        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
}
