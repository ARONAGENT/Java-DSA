package strings;

/*
 * StringBuilder in Java:
 * - `StringBuilder` is a mutable sequence of characters.
 * - Unlike `String`, `StringBuilder` allows modifications (appending, inserting, deleting) without creating new objects.
 * - It is more **efficient** than `String` when performing multiple string manipulations.
 *
 * Properties of StringBuilder:
 * 1. **Mutable**: Can modify its content without creating a new object.
 * 2. **Efficient**: Faster than `String` when performing many modifications.
 * 3. **Provides additional methods** like `append()`, `insert()`, `delete()`, `replace()`, and `reverse()`.
 */
public class StringBuilders {
    public static void main(String[] args) {
        // Initializing a StringBuilder
        StringBuilder company = new StringBuilder("Aron Agency");
        StringBuilder compDesc = new StringBuilder("It is a prominent agency that will help in the context of web development.");

        // Convert to uppercase and lowercase (manual since StringBuilder doesn't have built-in methods)
        System.out.println(new StringBuilder(company.toString().toUpperCase())); // Converts to uppercase
        System.out.println(new StringBuilder(company.toString().toLowerCase())); // Converts to lowercase

        // Checking prefixes and suffixes (StringBuilder doesn't have direct methods, so we use String)
        System.out.println(compDesc.toString().startsWith("Your")); // Checks if it starts with "Your"
        System.out.println(company.toString().endsWith("ncy")); // Checks if it ends with "ncy"

        // Checking if a substring exists
        System.out.println(company.toString().contains("aron")); // Case-sensitive check

        // Finding the index of a character
        System.out.println(company.indexOf("r")); // Returns index of first occurrence of 'r'

        // Comparing Strings (case-insensitive)
        StringBuilder nm = new StringBuilder("Goku");
        System.out.println(nm.toString().equalsIgnoreCase("goku")); // Converts to String and compares

        // Splitting a string using a delimiter (not available in StringBuilder, so convert to String)
        StringBuilder data = new StringBuilder("Rohan,20,backend developer,45000");
        String[] dataContains = data.toString().split(","); // Splitting by comma
        for (String record : dataContains)
            System.out.println(record);

        // Extracting substrings using substring() method
        System.out.println(compDesc.substring(10)); // Substring from index 10 to end
        System.out.println(compDesc.substring(2, 9)); // Substring from index 2 to 8

        // Checking if StringBuilder is empty (since isEmpty() is not available, check length)
        StringBuilder str = new StringBuilder("");
        System.out.println(str.length() == 0); // Returns true if empty

        // Removing leading and trailing spaces using manual approach (trim() not available for StringBuilder)
        StringBuilder newName = new StringBuilder("           Rohan                ");
        System.out.println(newName); // Prints with spaces
        System.out.println(new StringBuilder(newName.toString().trim())); // Convert to String, trim spaces, and convert back

        // Additional StringBuilder-specific operations:
        company.append(" Pvt Ltd"); // Appending text
        System.out.println(company);

        company.insert(4, " Solutions"); // Inserting text at a specific index
        System.out.println(company);

        company.replace(0, 4, "Global"); // Replacing part of the string
        System.out.println(company);

        company.delete(6, 14); // Deleting characters from index 6 to 14
        System.out.println(company);

        company.reverse(); // Reversing the string
        System.out.println(company);
    }
}
