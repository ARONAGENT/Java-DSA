package recursion.basicProblems;

public class Palindrome_Using_Functional_recursion {
    static String name="12321";

    static boolean is_palindrome(int i){

        if(i>=(name.length()/2)){
            return true;
        }
        if(name.charAt(i)!=name.charAt(name.length()-i-1)){
            return false;
        }

        return is_palindrome(i+1);
    }


    public static void main(String[] args) {

        System.out.println(is_palindrome(0));
    }
}
