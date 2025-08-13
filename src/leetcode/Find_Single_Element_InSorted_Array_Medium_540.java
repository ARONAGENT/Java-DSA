package leetcode;

public class Find_Single_Element_InSorted_Array_Medium_540 {

    // here if mid is odd
    // and if mid==mid-1 then element will be in right side
    // here if mid is even
    // if mid=mid+1
    // then mid is always left side
    static int find_single_ele(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        else if(nums[0]!=nums[1]){
            return nums[0];

        }else if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid+1]!=nums[mid]){
                return nums[mid];
            }else if(mid%2==1){
                if(nums[mid]==nums[mid-1]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(nums[mid]==nums[mid+1]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,5,5};
        System.out.println(find_single_ele(nums));
    }

}
