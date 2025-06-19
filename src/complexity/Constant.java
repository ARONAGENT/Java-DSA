package complexity;

public class Constant {
//① Big O(1) - Constant Time
//No matter the size of the array, accessing any element takes a constant time (1 step).
//Ex: Accessing a specific element in an array by index.
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printFirstElement(numbers);
    }

    // Always executes in constant time regardless of input size
    static void printFirstElement(int[] arr) {
        System.out.println("First element: " + arr[0]);
    }
}
