package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={56,76,35,23,12};

        // first loop goes from n-1 passes
        for(int i=0;i<arr.length-1;i++) {
            //Second loops follows n,n-1,n-2 ...
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // time complexity of bubble sort is O(n^2)

        for(int sortedArr:arr){
            System.out.print(sortedArr+" ");
        }
    }
}
