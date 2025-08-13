package recursion.basicProblems;

public class Print_1_to_N_without_plus {
    static void f1(int i,int N){
        if(i<1){
            return;
        }
        f1(i-1,N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int i=3;
        int N=3;
        f1(i,N);
    }
}
