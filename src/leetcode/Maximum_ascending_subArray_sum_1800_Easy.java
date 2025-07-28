package leetcode;

public class Maximum_ascending_subArray_sum_1800_Easy {
   static int maximum_subarray_Sum(int[] nums){
       int currmax=nums[0];
       int max=nums[0];

       for (int i = 1; i <nums.length ; i++) {
           if(nums[i-1]<nums[i]){
               currmax+=nums[i];
           }else {
               max=Math.max(max,currmax);
               currmax=nums[i];
           }
       }
       return Math.max(currmax,max);
   }

    public static void main(String[] args) {
       int[] nums={1,2,3,2,4,6};
       int ans=maximum_subarray_Sum(nums);
        System.out.println(ans);
    }
}
