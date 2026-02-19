package arrays.lastSuccess;

import java.util.Arrays;

public class MovesZerosAtTheEnd {
    public static void moveZeroes(int[] nums) {
        int[] nums2=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums2[j]=nums[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(nums2));
    }
    public static void moveZeroes2(int[] nums) {
        int i=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes2(nums);
    }
}
