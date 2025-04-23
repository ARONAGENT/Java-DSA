package collection_frameworks.priority_queue;

import java.util.*;
// Priority Queue Functions ->
public class PQ_functions {
    public static void main(String[] args) {
        //PriorityQueue<String> names=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<String> names=new PriorityQueue<>();

        names.add("Rohan");
        names.add("Rahul");
        names.add("Om");
        names.add("Yash");
        names.add("Vedant");
        names.add("Athrava");
        // 1.See Output of Priority Queue
        System.out.println("Original PriorityQueue: " + names);
        // 2.add element using offer
        names.offer("Hrutvik");
        System.out.println(names);
        // 3. Peeking the top (smallest) element
        System.out.println("Top element (peek): " + names.peek());
        // 4. Polling (removing the smallest element)
        System.out.println("Polled element: " + names.poll());
        System.out.println("PriorityQueue after poll: " + names); // 5. Removing a specific element
         names.remove("Rahul");
         System.out.println("After removing 'Rahul': " + names);
         // 6. Checking if an element exists
        System.out.println("Does the queue contain 'Ritesh'? " + names.contains("Ritesh"));
        // 7. Checking the size of the queue
        System.out.println("Size of PriorityQueue: " + names.size());
        // 8. Iterating using for-each loop
        System.out.println("\nIterating using for-each loop:");

        //9.Iteration using For each loop
        for (String name : names) {
            System.out.println(name);
        }

        // 10. Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //11.Sorted ArrayList
        ArrayList<String>sortedList = new ArrayList<>(names);
        Collections.sort(sortedList);
        System.out.println("\nSorted PriorityQueue elements: " + sortedList);
        // 12. Clearing the PriorityQueue names.clear()
        names.clear();
        System.out.println("After Clearing the Priority Queue"+names);

    }

}
