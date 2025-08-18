package leetcode;

// brute Force
public class Maximum_SubArray_Sum_Leetcode_53_medium {
    static int max_sum(int[] nums){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length; i++) {
            int current_sum=0;
            for (int j = i+1; j <nums.length ; j++) {
                current_sum+=nums[j];
                max=Math.max(current_sum,max);
            }
        }

        return max;
    }

    static public int maxSubArray(int[] nums) {
        int curr_sum=nums[0];
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            if(curr_sum+nums[i]>nums[i]){
                curr_sum+=nums[i];
            }else{
                curr_sum=nums[i];
            }
            max=Math.max(curr_sum,max);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(max_sum(nums));
        System.out.println(maxSubArray(nums));
//        int ans=max_sum(nums);
//        System.out.println(ans);
    }
}
