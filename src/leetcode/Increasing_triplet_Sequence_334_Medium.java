package leetcode;

public class Increasing_triplet_Sequence_334_Medium {
    static boolean isTripletSequence(int[] nums){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=first){
                first=nums[i];
            } else if (nums[i]<=second) {
                second=nums[i];
            }else {
                third=nums[i];
                return true;
            }

        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,2,1};
        int[] nums2={5,4,3,2,1};

        boolean ans1=isTripletSequence(nums);
       boolean ans2= isTripletSequence(nums2);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
