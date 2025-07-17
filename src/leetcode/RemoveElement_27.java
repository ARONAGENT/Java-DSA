package leetcode;

public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        int ptr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        return ptr;
    }

    public static void main(String[] args) {
        int[] nums={1,3,4,5,3,21,2};
        int val=3;
        int ans=removeElement(nums,val);
        // expected output=5 nums=[1,4,5,21,2,_,_]
        System.out.println(ans);
    }
}
