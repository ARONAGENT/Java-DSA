package recursion.level1;

public class nth_power_of_x_with_logn_complexity {
    public static int calcPower(int x,int n){
        if (n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcPower(x,n/2) *calcPower(x,n/2);
        }
        else{
            return  calcPower(x,n/2) *calcPower(x,n/2) *x;
        }

    }
    public static void main(String[] args) {
        int val=calcPower(2,5);
        System.out.println(val);
    }
}
