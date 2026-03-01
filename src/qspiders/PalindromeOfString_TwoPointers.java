package qspiders;

public class PalindromeOfString_TwoPointers {
    public static void main(String[] args) {

        String  str="MADAM";
        boolean assump=true;
        for (int i = 0,j=str.length()-1; i <str.length()/2 ; i++,j--) {
            if(str.charAt(i)!=str.charAt(j)){
                assump=false;
                break;
            }
        }
        if(assump)
            System.out.println(str+" is a Palindrome ");
        else
            System.out.println(str+" is not a Palindrome");

    }
}
