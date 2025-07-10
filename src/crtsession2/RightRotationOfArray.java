package crtsession2;

public class RightRotationOfArray {
    public static void main(String[] args) {
        int[] arr={21,28,5,4,8};
        int k=2;
        int[] arr2=new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr2[(i+k) % 5]=arr[i];
        }

        for(int i:arr2){
            System.out.print(i+" ");
        }
    }


}
