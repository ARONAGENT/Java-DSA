package recursion.level2;

public class CharProgram {
    public static boolean[] map = new boolean[26];

    public static void main(String[] args) {
        // Print index and corresponding character
        for (int i = 0; i < map.length; i++) {
            char character = (char) ('a' + i);
            System.out.println("Index: " + i + ", Character: " + character);
        }
    }
}
