package arrays.focus_dsa;

import java.util.Arrays;

public class SortUsing_bubble_sort {
    public static void main(String[] args) {
        int[] arr={2,4,34,56,76,43,21,22,445,99,-9};
        int temp;
        // brute force method
        for(int i=0;i< arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i ;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // traverse sorted array
        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------");
        // using pre-defined function
        int[] arr2={2,4,34,56,76,43,21,22,445,99,-9};

        // time complexity = ....
        Arrays.sort(arr2);

        for (int j : arr2) {
            System.out.print(j + " ");
        }

    }
}

