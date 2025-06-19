package complexity;

public class Quadratic_Times_n_Square {
//    ③ O(n²) - Quadratic Time
//As the input grows, the time taken increases quadratically.
//Ex: Bubble Sort or checking all pairs in an array.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllPairs(arr);
    }

    // Nested loop: runs n*n times for input size n
    static void printAllPairs(int[] arr) {
        for (int i : arr) {
            for (int j : arr) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
}
