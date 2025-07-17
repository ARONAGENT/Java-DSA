package exceptions;

public class SimpleArithmeticException {
    public static void main(String[] args) {
        int a=1/0;
        System.out.println(a);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at exceptions.SimpleArithmeticException.main(SimpleArithmeticException.java:5)
    }
}
