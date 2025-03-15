package arrays;

public class FindMaximumValue {
    public static void main(String[] args) {
        int marks[]={1,34,5,6,78,34,2};

        int max=Integer.MIN_VALUE;
        for(int mark:marks){
            if (mark>max){
                max=mark;
            }
        }
        System.out.println("Maximum No is "+max);
    }
}
