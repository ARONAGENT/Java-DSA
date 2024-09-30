package loops;

public class DoWhile {
public static void main(String[] args) {
	int i=0;
	System.out.println("Printing cube for 0 to 9");
	do {
		System.out.println("Cube of "+i+" is "+i*i*i);
		i++;
	}while(i<10);
}
}
