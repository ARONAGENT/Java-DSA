package hashing;

public class NormalApproachExample {

    static int no_of_occurance(int elements,int[] nums){
      int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==elements){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        System.out.println(no_of_occurance(0,nums));


    }
}
