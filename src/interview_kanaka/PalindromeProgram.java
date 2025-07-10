package interview_kanaka;

public class PalindromeProgram {

    public static int isPalindrome(String s ,int left,int right){
        // Base case
        if (left >= right)
            return 1;
        if (s.charAt(left) != s.charAt(right))
            return 0;
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s="ababa";
        int left=0;
        int right=s.length()-1;
        int result=isPalindrome(s,left,right);
        System.out.println(result);
    }
}
