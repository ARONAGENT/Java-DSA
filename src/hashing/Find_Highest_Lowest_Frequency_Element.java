package hashing;

import java.util.HashMap;
import java.util.Map;

public class Find_Highest_Lowest_Frequency_Element {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,2,3,4,4,5,5};

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i],0)+1);
        }


        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = -1;
        int minElement = -1;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();

            // Check max
            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = element;
            }

            if (freq < minFreq) {
                minFreq = freq;
                minElement = element;
            }
        }

        System.out.println("Most frequent element: " + maxElement + " (" + maxFreq + " times)");
        System.out.println("Least frequent element: " + minElement + " (" + minFreq + " times)");
    }
}
