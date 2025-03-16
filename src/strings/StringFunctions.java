package strings;

/*
 * Strings in Java:
 * - A String in Java is a sequence of characters, stored as an object of the `String` class.
 * - Strings are **immutable**, meaning they cannot be changed after creation.
 * - Java provides the `String` class with various built-in methods to manipulate strings.
 *
 * Properties of Strings in Java:
 * 1. Immutable: Once created, a String cannot be changed.
 * 2. Stored in the **String Pool** for optimization.
 * 3. Can be created using literals (`"text"`) or the `new` keyword (`new String("text")`).
 * 4. Supports various methods like `length()`, `substring()`, `toUpperCase()`, `trim()`, etc.
 */

public class StringFunctions {
    public static void main(String[] args) {
        // String Initialization
        String company = "Aron Agency";
        String compDesc = "It is a prominent agency that will help in the context of web development.";

        // Converting to uppercase and lowercase
        System.out.println(company.toUpperCase()); // Converts to uppercase
        System.out.println(company.toLowerCase()); // Converts to lowercase

        // Checking prefixes and suffixes
        System.out.println(compDesc.startsWith("Your")); // Checks if the string starts with "Your"
        System.out.println(company.endsWith("ncy")); // Checks if the string ends with "ncy"

        // Checking if a substring exists in the string
        System.out.println(company.contains("aron")); // Case-sensitive check for "aron"

        // Finding the index of a character
        System.out.println(company.indexOf('r')); // Returns the index of the first occurrence of 'r'

        // Comparing Strings (case-insensitive)
        String nm = "Goku";
        System.out.println(nm.equalsIgnoreCase("goku")); // Compares strings ignoring case

        // Splitting a string using a delimiter (",")
        String data = "Rohan,20,backend developer,45000";
        String[] dataContains = data.split(","); // Splitting by comma
        for (String record : dataContains)
            System.out.println(record); // Printing each split value

        // Extracting substrings
        System.out.println(compDesc.substring(10)); // Substring from index 10 to end
        System.out.println(compDesc.substring(2, 9)); // Substring from index 2 to 8

        // Checking if a string is empty
        String str = "";
        System.out.println(str.isEmpty()); // Returns true if string is empty

        // Removing leading and trailing spaces using trim()
        String newName = "           Rohan                ";
        System.out.println(newName); // Prints with spaces
        System.out.println(newName.trim()); // Prints without leading/trailing spaces
    }
}
