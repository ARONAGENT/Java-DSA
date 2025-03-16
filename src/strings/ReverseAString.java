package strings;

// Class to demonstrate reversing a string using StringBuilder
/*
* Explanation of the Code:
A StringBuilder is used, as it allows modifying characters directly.
Reversal logic:
Iterate only till half of the string (stringBuilder.length() / 2).
Swap characters from the front and back using setCharAt().
Continue until the middle is reached.
Intermediate outputs show step-by-step swapping.
Final reversed string is displayed.
* */
public class ReverseAString {
    public static void main(String[] args) {
        // Initializing a StringBuilder with a sample string
        StringBuilder stringBuilder = new StringBuilder("Aron Agent");
        System.out.println("Initially String -> " + stringBuilder);

        // Loop to reverse the string using swapping
        for (int i = 0; i < stringBuilder.length() / 2; i++) {
            int front = i; // Front index
            int back = stringBuilder.length() - 1 - i; // Back index

            // Extracting characters at front and back positions
            char frontChar = stringBuilder.charAt(front);
            char backChar = stringBuilder.charAt(back);

            // Swapping the characters
            stringBuilder.setCharAt(front, backChar);
            stringBuilder.setCharAt(back, frontChar);

            // Displaying intermediate steps
            System.out.println("When i = " + i + " then " + stringBuilder);
        }

        // Displaying the final reversed string
        System.out.println("Final String -> " + stringBuilder);
    }
}
