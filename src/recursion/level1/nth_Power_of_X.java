package recursion.level1;

public class nth_Power_of_X {
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int powernm1=calcPower(x,n-1);
        int powern= x* powernm1;
        return powern;
    }
    public static void main(String[] args) {
        int val=calcPower(2,5);
        System.out.println(val);
    }
}
