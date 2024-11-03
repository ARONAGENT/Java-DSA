package O8Arrays;

public class IntMinMaxValues {
//Integer.MIN_VALUE: The smallest possible value an int can hold in Java, which is -2,147,483,648.
//Integer.MAX_VALUE: The largest possible value an int can hold in Java, which is 2,147,483,647.
//These constants represent the extremes of the int data type range in Java. Handy for edge case handling!
	public static void main(String[] args) {
        // Print the minimum and maximum values of an integer
        System.out.println("Minimum Integer Value: " + Integer.MIN_VALUE);
        System.out.println("Maximum Integer Value: " + Integer.MAX_VALUE);
    
}
	
	/*Why is this No are minimum and Maximum 
	These numbers are the minimum and maximum values for the int data type in Java
 	because of how binary representations work.
	Integer.MIN_VALUE (-2,147,483,648): In binary, this is represented as a 1 followed by 31 zeros. 
	The leading 1 indicates a negative number in the two's complement representation used by Java.

	Integer.MAX_VALUE (2,147,483,647): This is represented as 31 ones in binary,
 	indicating the largest positive number in two's complement.

	Two's complement is a method of encoding integers that allows 
	both positive and negative numbers to be represented in binary.
 	The bit patterns for these values are determined by the 32-bit architecture, 
 	where one bit is reserved for the sign (positive or negative),
 	 and the remaining 31 bits represent the number itself.
	 * */
}
