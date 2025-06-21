package leetcode;

class questions1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length-1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        questions1 sol = new questions1();
        int[] nums = {3, 2, 4};
        int target = 7;
        int[] result = sol.twoSum(nums, target);
        System.out.println("Indexes: [" + result[0] + ", " + result[1] + "]");
    }
}