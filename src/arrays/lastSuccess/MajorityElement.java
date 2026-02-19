package arrays.lastSuccess;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    // brute Solution O(n square)
    public static int majorityElement(int[] nums) {

        for (int i = 0; i <nums.length ; i++) {
            int cnt=0;
            for (int j = 0; j <nums.length; j++) {
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>nums.length/2) return nums[i];
        }
        return -1;
    }

    // better approach HashmapApproach
    public static int majorityElement1(int[] nums) {
        HashMap<Integer,Integer>  hashMap=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
           int count= hashMap.getOrDefault(nums[i],0)+1;
            if(!hashMap.containsKey(nums[i])){
               hashMap.put(nums[i],count);
           }
           if(count> nums.length/2){
               return nums[i];
           }
        }
        return -1;
    }

    // optimal solution moore's problem O(n) with space O(1)
    static int majorityElement2(int[] nums){
        int cnt=0;
        int el = 0;
        for (int i =0 ; i< nums.length;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            } else if (el==nums[i]) {
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==el) cnt1++;
        }
        if(cnt1>nums.length/2) return el;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
}
