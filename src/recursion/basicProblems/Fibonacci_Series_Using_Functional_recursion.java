package recursion.basicProblems;

public class Fibonacci_Series_Using_Functional_recursion {

    static int fibonacci_Number(int i){
        if(i<=1){
            return i;
        }
        return fibonacci_Number(i-1)+fibonacci_Number(i-2);
    }


    public static void main(String[] args) {
        System.out.println(fibonacci_Number(4));
    }
}


