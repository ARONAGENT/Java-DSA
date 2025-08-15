package hashing;

/**
 * Program to find the maximum possible array length in Java.
 * Java arrays have an upper limit due to:
 * 1. Integer indexing (index is an int, so max length is Integer.MAX_VALUE ≈ 2^31 - 1).
 * 2. Memory availability (depends on your JVM heap size).
 * 3. JVM implementation overhead (arrays have headers, so actual limit is slightly smaller than Integer.MAX_VALUE).
 * NOTE: This program tests allocation in a safe way without crashing your system.
 */

public class MaxArrayLength {

    static int[] globalArray;

    public static void main(String[] args) {
        System.out.println("Testing maximum array length inside main (local variable)...");
        int localMax = findMaxArraySizeLocal();

        System.out.println("\nTesting maximum array length for global static variable...");
        int globalMax = findMaxArraySizeGlobal();

        System.out.println("\nSummary:");
        System.out.println("Local variable max length  : " + localMax);
        System.out.println("Global variable max length : " + globalMax);
        System.out.println("⚠ In Java, both are stored in heap, so limits are usually the same.");
    }

    // Test with local array
    static int findMaxArraySizeLocal() {
        int testSize = 100_000_000;
        int lastSuccessfulSize = 0;

        while (true) {
            try {
                int[] localArray = new int[testSize];
                lastSuccessfulSize = testSize;
                System.out.println("✅ Local: " + testSize);
                testSize += 50_000_000;
            } catch (OutOfMemoryError e) {
                System.out.println("❌ Local failed at: " + testSize);
                break;
            }
        }
        return lastSuccessfulSize;
    }

    // Test with global array
    static int findMaxArraySizeGlobal() {
        int testSize = 100_000_000;
        int lastSuccessfulSize = 0;

        while (true) {
            try {
                globalArray = new int[testSize];
                lastSuccessfulSize = testSize;
                System.out.println("✅ Global: " + testSize);
                testSize += 50_000_000;
            } catch (OutOfMemoryError e) {
                System.out.println("❌ Global failed at: " + testSize);
                break;
            }
        }
        return lastSuccessfulSize;
    }
}

// Summary:
// basically both are same
//Local variable max length  : 1000000000
//Global variable max length : 500000000
//⚠ In Java, both are stored in heap, so limits are usually the same.