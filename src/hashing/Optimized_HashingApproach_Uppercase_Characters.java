package hashing;

public class Optimized_HashingApproach_Uppercase_Characters {
    public static void main(String[] args) {
        String s="AABBAACCD";

        int[] hash=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            hash[s.charAt(i)-'A']++;
        }

        char c='A';

        System.out.println(hash[c-'A']);
    }
}
