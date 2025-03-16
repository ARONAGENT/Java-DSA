package strings;

import java.util.StringTokenizer;

/*
 * StringTokenizer in Java:
 * - `StringTokenizer` is a legacy class in Java used to **split** a string into **tokens** (words, phrases, etc.).
 * - It is **faster** than `split()` and `Scanner` for tokenization.
 * - Unlike `split()`, it does not create a new array; instead, it parses tokens **on-demand**.
 *
 * Properties of StringTokenizer:
 * 1. Used to break a string into tokens.
 * 2. Can use multiple delimiters like space, comma, etc.
 * 3. Does not support regex-based splitting (unlike `split()`).
 * 4. Provides methods like `countTokens()`, `nextToken()`, `hasMoreTokens()`.
 */

public class StringTokenizerClass {
    public static void main(String[] args) {
        // Tokenizing a string using space as the default delimiter
        StringTokenizer stringTokenizer = new StringTokenizer("Goku The Son");

        // Counting tokens
        System.out.println("Total Tokens: " + stringTokenizer.countTokens());

        // Tokenizing using a comma (",") as a delimiter
        StringTokenizer stringTokenizer2 = new StringTokenizer("Vegeta,Goku,Whis,Beerus", ",");

        // Counting tokens
        System.out.println("Total Tokens with ',' as delimiter: " + stringTokenizer2.countTokens());

        // Printing all tokens one by one
        System.out.println("Tokens:");
        while (stringTokenizer2.hasMoreTokens()) {
            System.out.println(stringTokenizer2.nextToken());
        }

        // Using multiple delimiters: space and comma
        StringTokenizer multiDelimTokenizer = new StringTokenizer("Goku, Vegeta Whis, Beerus", " ,");

        // Printing each token separately
        System.out.println("Tokens with ',' and ' ' as delimiters:");
        while (multiDelimTokenizer.hasMoreTokens()) {
            System.out.println(multiDelimTokenizer.nextToken());
        }
    }
}
