package leetcode;


public class productExceptSelf_array_238_Easy {
    public static int[] productExceptSelf(int[] nums){

        int pro=1;
        for (int i =0; i<nums.length ; i++) {
             pro=pro*nums[i];
        }

        int[] ans=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            ans[i]=pro/nums[i];
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] ans=productExceptSelf(arr);
        for (int i:ans){
            System.out.print(i+" ");
        }
    }

}
