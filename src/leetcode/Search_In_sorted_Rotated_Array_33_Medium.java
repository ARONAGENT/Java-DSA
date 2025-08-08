package leetcode;

public class Search_In_sorted_Rotated_Array_33_Medium {

    // optimized O(logn)
    static int search_in_sorted_rotated_array(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            } else if (nums[start]<=nums[mid]) {
                if(nums[start]<=target && nums[mid]>target){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if (nums[end]>=target && target>nums[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=4;
        int ans=search_in_sorted_rotated_array(nums,target);
        System.out.println(ans);
    }

}
