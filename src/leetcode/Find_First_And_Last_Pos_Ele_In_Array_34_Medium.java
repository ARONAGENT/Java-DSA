package leetcode;

import java.util.Arrays;

public class Find_First_And_Last_Pos_Ele_In_Array_34_Medium {
    static int[] searchRange(int[] nums,int target){
    return new int[]{firstOccurance(nums,target),lastOccurance(nums,target)};
    }
    static int firstOccurance(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while (start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    static int lastOccurance(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while (start<=end){
            int mid=(start+end)/2;

            if (nums[mid]==target){
                ans=mid;
                start=mid+1;
            } else if (nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(nums,target);

        System.out.println(Arrays.toString(ans));
    }
}
