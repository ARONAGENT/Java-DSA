package leetcode;

import java.util.HashMap;

public class FindLucky_Integer_Easy_1394 {
    static int findLuckyInteger(int[] nums){
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }else {
                hashMap.put(nums[i],1);
            }
        }
        int ans=-1;
        for(int key:hashMap.keySet()){
            ans=Math.max(ans,key);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,3};
        int ans=findLuckyInteger(nums);
        System.out.println(ans);
    }

}
