package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={45,67,21,99,34};
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[smallest]>arr[j])
                    smallest=j;
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int sortedArr:arr){
            System.out.print(sortedArr+" ");
        }
    }
}
