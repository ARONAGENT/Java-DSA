package recursion.level1;

public class FactorialOfNumbers {
    public static int factorialOfNumbers(int n){
        if(n==1 || n==0){
            return 1;
        }
       int fact_nm1= factorialOfNumbers(n-1);
        int fac_nm = n*fact_nm1;
        return fac_nm;
    }

    public static void main(String[] args) {
    int result =factorialOfNumbers(5);
        System.out.println(result);
    }
}
