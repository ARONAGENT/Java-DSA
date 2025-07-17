package exceptions.customException.InsufficientBalanceEx;

public class BalanceCalculator {
    public static void main(String[] args) {
        double balance=40000;
        try {
            if (balance<50000){
                throw new InsufficientBalanceException("Insufficient Balance .... less than 50000 not allowed");
            }
        }catch (InsufficientBalanceException insufficientBalanceException){
            System.out.println(insufficientBalanceException);
        }
    }
}
