package recursion.level1;

public class First_N_NaturalNumbers {
    public static void printNum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printNum(i+1,n,sum);

    }
    public static void main(String[] args) {
        printNum(1,5,0);
    }
}
