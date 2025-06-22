package leetcode;

public class Question2 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int revNum=0;
        while(n>0){
            int d=n%10;
            revNum=revNum*10+d;
            n=n/10;
        }
        if(x == revNum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int x=1234;
        int y=121;
        Question2 question2=new Question2();
        boolean val=question2.isPalindrome(x);
        boolean val2=question2.isPalindrome(y);

        System.out.println("Number "+x+"is Palindrome :"+val);
        System.out.println("Number "+y+"is Palindrome :"+val2);


    }
}
// optimized approach
//  public boolean isPalindrome(int x) {
//       if(x<0){
//        return false;
//       }
//       int n=x;
//       int revNum=0;
//       while (n != 0) {
//        revNum = revNum * 10 + n % 10;
//        n = n / 10;
//        }
//        return (revNum == x);
//    }