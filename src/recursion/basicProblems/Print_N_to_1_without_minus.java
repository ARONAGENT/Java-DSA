package recursion.basicProblems;

public class Print_N_to_1_without_minus {
    static void f2(int i,int N){
        if(i>N){
            return;
        }
        f2(i+1,N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int i=1;
        int N=3;
        f2(i,N);
    }
}
