package recursion.level3;

import java.util.*;

public class Find_All_Permutation_Of_String_Iterative {
    public static void findPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permutations.add(""); // Start with an empty permutation

        for (char c : str.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();
            for (String perm : permutations) {
                for (int i = 0; i <= perm.length(); i++) {
                    String newPerm = perm.substring(0, i) + c + perm.substring(i);
                    newPermutations.add(newPerm);
                }
            }
            permutations = newPermutations; // Update list with new permutations
        }

        // Print all generated permutations
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    public static void main(String[] args) {
        findPermutations("abc");
    }
}
