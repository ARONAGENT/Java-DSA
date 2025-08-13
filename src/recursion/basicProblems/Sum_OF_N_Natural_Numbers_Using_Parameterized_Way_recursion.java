package recursion.basicProblems;



public class Sum_OF_N_Natural_Numbers_Using_Parameterized_Way_recursion {
    static void sum(int N,int sum){
        if(N<1){
            System.out.println(sum);
            return;
        }
         sum(N-1,sum+N);
    }

    public static void main(String[] args) {
        int N=4;
        int sum=0;
        sum(N,sum);
    }
}
