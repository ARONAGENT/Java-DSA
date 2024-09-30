package nestedloop.PatternsProblems;

public class ZeroOneTriangle {
public static void main(String[] args) {
	int n=5;
	int p=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			if(p==1) {
				System.out.print(p);
				p=0;
			}else {
				System.out.print(p);
				p=1;
			}
		}
		System.out.println();
	}
}
}
