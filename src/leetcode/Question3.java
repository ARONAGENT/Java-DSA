package leetcode;

public class Question3 {
    public boolean isPowerOf2(int x){
        return x % 10 == 1 || x % 10 == 4 || x % 10 == 6 || x % 10 == 8;
    }

    public static void main(String[] args) {
        Question3 question3=new Question3();
        boolean val=question3.isPowerOf2(128);
        System.out.println(val);
    }
}
