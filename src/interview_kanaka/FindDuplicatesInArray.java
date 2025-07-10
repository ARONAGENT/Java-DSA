package interview_kanaka;

public class FindDuplicatesInArray {
    public  static boolean isDuplicate(int[] arr){

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,2,5,67,8};
        boolean val=isDuplicate(arr);
        System.out.println(val);
    }
}
