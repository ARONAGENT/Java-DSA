package recursion.basicProblems;

public class Sum_OF_N_Natural_Numbers_Using_Functional_Way_recursion {

    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }


    public static void main(String[] args) {

        int n=6;
        System.out.println(sum(n));
    }
}
