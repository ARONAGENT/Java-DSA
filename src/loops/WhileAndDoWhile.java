package loops;

public class WhileAndDoWhile {
public static void main(String[] args) {
	
	int i=9;
	while(i<3) {
		System.out.println("While Loop execution");
		
	}
	//This behavior makes do-while loops useful in scenarios 
	//where you want to ensure that a block of code runs at least once, 
	//regardless of the condition.

	do {
		System.out.println("Do While Execution ");
	}while(i<3);
	
	// here the condition is false i<3  => 9<3 is false 
	//so while loop check condition is false hence while can't be executed
	//but in case do while it first executed the code inside first then checked condition
	// hence in do while the output will print
}
}
