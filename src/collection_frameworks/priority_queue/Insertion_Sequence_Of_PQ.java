package collection_frameworks.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * PriorityQueue -> A special type of Queue in Java backed by a Binary Heap.
 *                  Part of java.util and implements the Queue interface.
 *
 * 🔹 Key Characteristics:
 * - Does NOT maintain insertion order.
 * - Orders elements based on natural ordering (Min Heap by default).
 * - Duplicate values are allowed.
 * - Null values are NOT allowed (throws NullPointerException).
 * - Not synchronized (i.e., not thread-safe).
 *
 * 🔹 Binary Heap:
 * - Min Heap: Root is smallest → Default behavior of PriorityQueue
 * - Max Heap: Root is largest → Achieved using Comparator.reverseOrder()
 */

public class Insertion_Sequence_Of_PQ {
    public static void main(String[] args) {
        // ✅ PriorityQueue with natural ordering (Min Heap)
        PriorityQueue<Integer> nums = new PriorityQueue<>();

        // Adding elements
        nums.add(18);
        nums.add(25);
        nums.add(77);
        nums.add(9);
        nums.add(13);
        nums.add(26);
        nums.add(11);
        nums.add(73);
        nums.add(89);
        nums.add(15);

        /*
         * Internally stored as a Min Heap:
         * Not printed in sorted order, but the root will always be the smallest element.
         * Structure maintained like:
         *         9
         *       /   \
         *     13    11
         *    / \    / \
         *   25 15 77  26 ...
         */

        System.out.println("Min Heap (Default PQ): " + nums);
        // Output will look like: [9, 13, 11, 25, 15, 77, 26, 73, 89, 18]
        // ⚠️ Note: It doesn’t mean sorted order — it's the internal heap structure.

        // ✅ PriorityQueue with custom comparator for Max Heap
        PriorityQueue<Integer> nums2 = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding same elements as before
        nums2.add(18);
        nums2.add(25);
        nums2.add(77);
        nums2.add(9);
        nums2.add(13);
        nums2.add(26);
        nums2.add(11);
        nums2.add(73);
        nums2.add(89);
        nums2.add(15);

        /*
         * Now acts as a Max Heap:
         * - Root is the maximum element
         * - Useful for problems where highest priority = highest number
         */

        System.out.println("Max Heap (Custom Comparator): " + nums2);
        // Output will look like: [89, 25, 77, 18, 15, 26, 11, 9, 73, 13]

    }
}
