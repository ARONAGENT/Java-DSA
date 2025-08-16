package sorting_algos;

import java.util.Arrays;

public class QuickSort {
    public void qs(int[] arr,int low ,int high){
        if(low<high){
            int partition=findPivot(arr,low,high);
            qs(arr,low,partition-1);
            qs(arr,partition+1,high);
        }
    }

    public int findPivot(int[] arr,int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){

            while(pivot>=arr[i] && i<=high-1 ){
                i++;
            }

            while(pivot<arr[j] && j>=low+1){
                j--;
            }

            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        QuickSort quick=new QuickSort();

        int[] nums={7,4,5,1,3};
        quick.qs(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));


    }
}
