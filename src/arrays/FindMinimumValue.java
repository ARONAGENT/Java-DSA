package arrays;

public class FindMinimumValue {
    public static void main(String[] args) {
        int[] age={21,32,12,19,34,5};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < age.length; i++) {
            if (age[i]<min){
                min=age[i];
            }
        }
        System.out.println("Minimum No is "+min);
    }
}
