package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class OptimizedQuestion1 {
    public static int[] twoIndex(int[] arr, int target){
        HashMap<Integer,Integer> numMap=new HashMap<>();
        for(int i=0; i< arr.length;i++){
            int diff= target- arr[i];
            if(numMap.containsKey(diff)){
                return new int[]{numMap.get(diff),i};
            }
            numMap.put(arr[i],i);
        }
     return null;
    }
    public static void main(String[] args) {
        int[] arr={2,6,8,7,9};
        int target=14;
      int result[]= twoIndex(arr,target);
        System.out.println(Arrays.toString(result));
        // return 1,2
    }
}
// video link - https://youtu.be/o42jBlO09Vg?si=CoKbD9d3rrhb-E7N