package complexity;

public class Factorial_Time {
//    ⑦ O(n!) - Factorial Time Complexity
//Factorial time complexity occurs in algorithms that involve generating all possible permutations of a set,
// such as brute-force solution for the Traveling Salesman Problem.
    public static void main(String[] args) {
        String str = "ABC";
        generatePermutations(str, "");
    }

    static void generatePermutations(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(rest, result + ch);
        }
    }
}
