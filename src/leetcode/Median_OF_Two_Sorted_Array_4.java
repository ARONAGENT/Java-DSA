package leetcode;

public class Median_OF_Two_Sorted_Array_4 {

    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        int[] ans=merge(nums1,nums2);

        if(ans.length %2 ==0){
            return (double) (ans[ans.length / 2] + ans[ans.length / 2 - 1]) /2;

        }else{
            return (double) ans[ans.length/2];
        }
    }


    public int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < arr1.length || p2 < arr2.length) {
            int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if (val1 < val2) {
                ans[p3] = val1;
                p1++;
            } else {
                ans[p3] = val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Median_OF_Two_Sorted_Array_4 medianOfTwoSortedArray4=new Median_OF_Two_Sorted_Array_4();

        int[] arr1={2,5,8,9};
        int[] arr2={1,4,7,10};
        int[] ans=  medianOfTwoSortedArray4.merge(arr1,arr2);
        for(int i: ans){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Median is :"+medianOfTwoSortedArray4.findMedianSortedArrays(arr1,arr2));
    }
}

