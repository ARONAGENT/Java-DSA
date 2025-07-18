package leetcode;

public class Return_Indexes_OF_Target_Addition_167_Easy {

    // complexity O(n^2)
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        for(int i=0;i<numbers.length;i++){
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i] + numbers[j] == target) {
                    ans[0] = i+1;
                    ans[1] = j+1;
                }
            }
        }
        return ans;
    }

    // here the condition is The tests are generated such that there is exactly one solution.
    //    You may not use the same element twice.
    // also the array of input are sorted hence we can used two pointer apprroach

    // Complexity O(n)
    public int[] twoSumOptimized(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }else if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums={2,3,4};
        int[]ans=twoSum(nums,6);
        for (int i:ans) {
            System.out.print(i+" ");
        }
    }
}
