package leetcode;

public class Largest_Number_At_Least_Twice_of_Others_Easy_747 {
    public  static int dominantIndex(int[] nums) {
        int max=-1;
        int smax=-1;
        int maxid=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
                maxid=i;
            }else if(nums[i]>smax){
                smax=nums[i];
            }
        }

        if(smax*2<=max){
            return maxid;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums={6,3,1,0};
        int ans=dominantIndex(nums);
        System.out.println(ans);
    }
}
