package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {7, 8, 1, 3, 2};


        //insertion sort
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                //Keep swapping
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        for(int sortedArr:arr){
            System.out.print(sortedArr+" ");
        }

    }
}
