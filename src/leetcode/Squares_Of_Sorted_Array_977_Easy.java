package leetcode;

public class Squares_Of_Sorted_Array_977_Easy {
   public static int[] SquaresOfSortedArray(int[] nums){
       int[] ans=new int[nums.length];
       int start=0;
       int end= nums.length-1;
       int ptr= ans.length-1;

       while (start<=end){
           int ss= nums[start]*nums[start];
           int es= nums[end]*nums[end];

           if(ss<es){
               ans[ptr]=es;
               end--;
           }else{
               ans[ptr]=ss;
               start++;
           }
           ptr--;
       }
       return ans;
   }

    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] ans=SquaresOfSortedArray(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
