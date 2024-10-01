package advancePatternProblems;

public class HollowRhombus {
public static void main(String[] args) {
	int n=5;
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=n;j++) {
			if(i==1 || i==n || j==1 || j==n) {
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	
	//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=1;j<=n;j++) {
//			if(i==2 && j==2 || i==3 && j==3 || i==4 && j==4 ||
//				i==2 && j==3 || i==3 && j==2
//				|| i==2 &&j==4|| i==4 && j==2 || i==3 && j==4 || i==4 && j==3) {
//			System.out.print(" ");
//			}
//			else {
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//	}
}
}
