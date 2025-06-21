package arrays.focus_dsa;

public class TraverseArray {
    public static void main(String[] args) {
        int[] arr={2,4,34,56,76,43,21,22,445};

        // simple traverse O(n)
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        // using forEach loop
        for (int j : arr) {
            System.out.print(j + " ");
        }



    }
}
