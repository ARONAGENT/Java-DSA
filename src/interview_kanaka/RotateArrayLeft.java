package interview_kanaka;

public class RotateArrayLeft {
    public static int[] rotateLeft(int[] arr,int k){
        int[] arr2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[(i-k+arr2.length)% arr2.length]=arr[i];
        }
        return arr2;
    }


    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,1};
        int k=2;
        int[] ans=rotateLeft(arr,k);
        for (int i :ans) {
            System.out.print(i+" ");
        }
    }
}
