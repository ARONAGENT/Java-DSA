package interview_kanaka;

public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Check divisibility from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int n = 7;
        if(isPrime(n)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
