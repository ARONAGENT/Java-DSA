package recursion.basicProblems;

import java.util.Arrays;

public class Reverse_A_Array_Using_Functional {

    static int[] arr={5,4,3,2,1};
    static int[] reverse_array(int i){
        if(i>=(arr.length/2)){
            return arr;
        }
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        return reverse_array(i+1);
    }

    public static void main(String[] args) {
        int[] ans=reverse_array(0);
        System.out.println(Arrays.toString(ans));
    }
}
