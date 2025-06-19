package complexity;

public class Exponential_Time {
//    ⑥ O(2ⁿ) - Exponential Time Complexity
//The time grows exponentially with the size of the input, meaning it doubles with each additional input.
//Ex: Recursive algorithms that solve a problem by breaking it into multiple smaller subproblems, such as calculating Fibonacci numbers using recursion.
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci of " + n + ": " + fib(n));
    }

    // Recursive Fibonacci (inefficient version)
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}

