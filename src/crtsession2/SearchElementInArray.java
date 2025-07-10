package crtsession2;

public class SearchElementInArray {
    public static void searchElement(int k,int [] arr) {
        for (int i=0;i< arr.length-1;i++) {
            if (i == k) {
                System.out.println("true");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        int k=6;
       searchElement(k,arr);


    }
}
