package arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        for (int i = 0; i <nums.length; i++) {
            nums[i]*=nums[i];
        }
        int temp=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length-1 ; j++) {
                if(nums[i]<nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }

        for(int i:nums){
            System.out.print(i +" ");
        }
    }

}
