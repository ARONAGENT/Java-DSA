package exceptions.customException.InsufficientBalanceEx;

public class InsufficientBalanceException extends RuntimeException{
        public InsufficientBalanceException(String message){
            super(message);
        }
}
