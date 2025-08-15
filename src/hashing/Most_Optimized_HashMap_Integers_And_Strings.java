package hashing;

import java.util.HashMap;
import java.util.Map;

public class Most_Optimized_HashMap_Integers_And_Strings {
    public static void main(String[] args) {
        // Integer frequency count
        HashMap<Integer, Integer> intMap = new HashMap<>();
        int[] arr = {1, 2, 3, 1, 3, 1};

        for (int num : arr) {
            intMap.put(num, intMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Integer frequencies:");
        for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // String frequency count
        HashMap<String, Integer> strMap = new HashMap<>();
        String[] words = {"apple", "banana", "apple", "cherry", "banana", "apple"};

        for (String word : words) {
            strMap.put(word, strMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nString frequencies:");
        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
