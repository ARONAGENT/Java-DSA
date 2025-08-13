package recursion.basicProblems;

import java.util.Arrays;

public class Reverse_A_Array_Using_Parameterized {

   static int[] arr={1,2,3,4,5};
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse_array(int l,int r){
        if(l>=r){
            return;
        }
        swap(arr,l,r);
        reverse_array(l+1,r-1);
    }
    //-------------------------------------------------------------------------------------------------------

    // using directly inside swapping because java behaviour is pass by value
    // When you call:
    //swap(arr[l], arr[r]);
    //arr[l] and arr[r] are primitive int values, so Java passes copies into swap().
    //Inside swap(), you swap those copies, not the elements in the array.
    //That’s why the original array remains unchanged.
    static void reverse_array2(int l,int r){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse_array(l+1,r-1);
    }

    public static void main(String[] args) {
        reverse_array2(0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
