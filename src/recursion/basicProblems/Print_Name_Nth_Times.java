package recursion.basicProblems;

public class Print_Name_Nth_Times {
   static int n=0;
    static void f1(){
        if(n==5) {
            return;
        }
        System.out.println("rohan");
        n++;
        f1();

    }

    public static void main(String[] args) {
        f1();
    }
}
