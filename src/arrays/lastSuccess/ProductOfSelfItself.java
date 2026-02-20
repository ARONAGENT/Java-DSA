package arrays.lastSuccess;

import java.util.Arrays;

public class ProductOfSelfItself {

    // brute approach O(n square)
    static int[] productOfSelfExcept(int[] nums){
        int[] nums2=new int[nums.length];
        int pointer=0;
        for (int i = 0; i <nums.length ; i++) {
            int pro=1;
            for (int j = 0; j <nums.length ; j++) {
                if(j!=pointer){
                    pro*=nums[j];
                }
            }
            nums2[i]=pro;
            pointer++;
        }
        return nums2;
    }


    // Optimized with O(2n) time and Space Complexity
    static public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] right=new int[n];
        int pro=1;
        for(int i=n-1;i>=0;i--){
            pro*=nums[i];
            right[i]=pro;
        }
        int left=1;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){
            int val=left*right[i+1];
            ans[i]=val;
            left*=nums[i];
        }
        ans[n-1]=left;
        return ans;
    }
    public static void main(String[] args) {

        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productOfSelfExcept(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}

