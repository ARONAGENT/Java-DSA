package leetcode;

public class FindMissingNo_268 {
    public static int missingNumber(int[] nums) {
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }

        int expectedSum= (nums.length*(nums.length+1))/2;

        return expectedSum-sum;
    }
    public static void main(String[] args) {
        int[] nums={0,1,3,4};
        int ans=missingNumber(nums);
        System.out.println(ans);
    }
}
