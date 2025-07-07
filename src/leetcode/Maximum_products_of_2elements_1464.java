package leetcode;

public class Maximum_products_of_2elements_1464 {
    public static int maxProduct(int[] nums){
        int max=-1;
        int smax=-1;
        for (int i = 0; i <nums.length ; i++) {
            if (max<nums[i]){
                smax=max;
                max=nums[i];
            } else if (smax<nums[i]) {
                smax=nums[i];
            }
        }
        return (max-1)*(smax-1);
    }

    public static void main(String[] args) {
       int[] arr={45,65,4,3,2};
        int val= maxProduct(arr);
        System.out.println(val);
    }
}
