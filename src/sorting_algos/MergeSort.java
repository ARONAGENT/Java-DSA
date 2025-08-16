package sorting_algos;

import leetcode.Merge_Sort_912;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public void mergeSort(int[] nums,int low ,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    public void merge(int[] nums,int low,int mid,int high){

        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;


        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }else {
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;

        }
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void main(String[] args) {
        int[] arr={5,3,26,0,47,86,32};
        Merge_Sort_912 mergeSort912=new Merge_Sort_912();
        int[] ans= mergeSort912.sortArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
