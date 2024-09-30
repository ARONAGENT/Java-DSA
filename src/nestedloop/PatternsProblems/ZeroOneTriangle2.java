package nestedloop.PatternsProblems;

public class ZeroOneTriangle2 {
public static void main(String[] args) {
	int n=5;
	int p=1;
	int q=0;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			if((i+j)%2==0) {
				System.out.print(p);
			}else {
				System.out.print(q);
			}
		}
		System.out.println();
	}
}
}
