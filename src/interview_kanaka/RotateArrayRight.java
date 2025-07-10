package interview_kanaka;

public class RotateArrayRight {
    public static int[] rotateRight(int[] arr, int k){
       int[] arr2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[(i+k) % arr2.length]=arr[i];
            //arr2[(i - k + arr2.length) % arr2.length] = arr[i];
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int k =1;
      int[] ans= rotateRight(arr,k);
        for(int nums:ans){
            System.out.print(nums+" ");
        }
    }
}
