package advancePatternProblems;

public class PascalsTriangle {
public static void main(String[] args) {
	
	        int n = 5; // Number of rows
	        
	        for (int i = 0; i < n; i++) {
	            // Print spaces for alignment
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            
	            // Calculate and print numbers for this row
	            int number = 1;
	            for (int j = 0; j <= i; j++) {
	                System.out.print(number + " ");
	                
	                // Calculate next number using the Pascal's Triangle formula **most imp formula for pattern**
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
}
}
