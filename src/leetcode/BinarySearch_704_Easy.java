package leetcode;

public class BinarySearch_704_Easy {
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]== target){
                return mid;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={11,22,24,30,35,38,40,99,111};
        int target=40;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }

}
