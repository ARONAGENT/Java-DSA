package leetcode;
// Without using divide operator
public class Mul_of_elements_except_that_238_Medium {
    public static int[] productExceptSelf(int[] nums){
        int[] right=new int[nums.length];
        int pro=1;
        for (int i = nums.length-1; i >=0 ; i--) {
            pro*=nums[i];
            right[i]=pro;
        }

        int left=1;
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length-1 ; i++) {
            int val=left*right[i+1];
            ans[i]=val;
            left*=nums[i];
        }
        ans[nums.length-1]=left;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        //expected output = 24,12,8,6
        int[] ans=productExceptSelf(arr);
        for (int i:ans) {
            System.out.print(i+" ");
        }
    }
}
