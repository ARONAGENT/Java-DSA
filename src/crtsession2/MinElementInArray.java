package crtsession2;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};

        int min=a[0];
        for (int i  :a) {
            if(min>i){
               min=i;
            }
        }

        System.out.println(min);
    }
}
