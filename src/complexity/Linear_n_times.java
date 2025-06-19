package complexity;

public class Linear_n_times {
    //② O(n) - Linear Time
    //The time grows directly proportional to the size of the input.
    //Ex: Traversing an array up to the length of that array.
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printAllElements(numbers);
    }

    // Runs a loop from 0 to n, where n = arr.length
    static void printAllElements(int[] arr) {
        for (int num : arr) {
            System.out.println("Element: " + num);
        }
    }
}
