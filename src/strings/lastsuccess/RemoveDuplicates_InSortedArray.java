package strings.lastsuccess;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates_InSortedArray {

    static int removeDuplicates(int[] nums){
            int p=0;
            for(int i=0;i<nums.length;i++){
                if(nums[p]!=nums[i]){
                    nums[p+1]=nums[i];
                    p++;
                }
            }
            return p+1;
        }

    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
