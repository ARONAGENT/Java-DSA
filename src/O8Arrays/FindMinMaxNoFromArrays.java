package O8Arrays;

public class FindMinMaxNoFromArrays {
    public static void main(String[] args) {
        int numbers[] = {1, 89, 90, 87, 65};
        // Initialize min and max with the first element of the array
        int min = numbers[0];
        int max = numbers[0];
        
        // Iterate through the array to find the actual min and max values
        // this for loop starts from  1 beacuse for comparing zeroth index we iterate from 1^st index
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } 
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Print out the minimum and maximum values
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
    }
}
