package interview_kanaka;

import java.util.Arrays;

public class Anagrams {
    static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1="rohan";
        String s2="hahahah";
        boolean val=areAnagrams(s1,s2);
        System.out.println(val);
    }
}
