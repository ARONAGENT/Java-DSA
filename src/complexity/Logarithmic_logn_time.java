package complexity;

public class Logarithmic_logn_time {
//    ④ O(log n) - Logarithmic Time
//A algorithm cuts the problem size in half with each step, so the time grows logarithmically.
//Ex: Binary Search.
    public static void main(String[] args) {
        int[] sortedArr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int index = binarySearch(sortedArr, target);
        System.out.println("Index of " + target + ": " + index);
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
