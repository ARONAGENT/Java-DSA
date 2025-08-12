package leetcode;

public class Insert_Search_Position_39_Easy {
    static int search_insert_position(int[] nums,int target){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5};
        int target=4;
        int ans=search_insert_position(nums,target);
        System.out.println(ans);
    }
}
