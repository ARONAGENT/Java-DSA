package exceptions;

public class HandlingArithmeticException {
    public static void main(String[] args) {
        try {
            int a=1/0;
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
            // java.lang.ArithmeticException: / by zero
        }
    }
}
