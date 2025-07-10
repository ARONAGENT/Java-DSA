package crtsession2;

public class AdditionOfArray {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};

        int sum=0;

        for (int i:a) {
            sum+=i;
        }System.out.println("For each :"+sum);
    }
}
