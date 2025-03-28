package recursion.level2;

public class ArraySorted_Strictly_Increasing {
    public static boolean isSorted(int[] arr,int idx){
        if(arr[idx]== arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }
}
