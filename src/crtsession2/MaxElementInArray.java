package crtsession2;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr={12,4,5,6,7,8,32,2};
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
}

