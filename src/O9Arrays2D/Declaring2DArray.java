package O9Arrays2D;

public class Declaring2DArray {
	public static void main(String[] args) {
		int[][] matrix1 = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix1[i][j]);
			}
			System.out.println();
		}
		
		
		int[][] matrix2 = new int[3][];
		matrix2[0] = new int[]{1, 2, 3};
		matrix2[1] = new int[]{4, 5, 6};
		matrix2[2] = new int[]{7, 8, 9};
	}
}
