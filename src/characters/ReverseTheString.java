package characters;

public class ReverseTheString {

    public static boolean isPalindrome(String s,int left,int right){
        if (left>=right){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        return isPalindrome(s,left+1,right-1);
    }


    public static void main(String[] args) {

        String name="RohanahoR";
        int left=0;
        int right=name.length()-1;
        boolean val=isPalindrome(name,left,right);
        System.out.println(val);

    }
}
