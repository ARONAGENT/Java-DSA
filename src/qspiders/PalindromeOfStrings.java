package qspiders;

public class PalindromeOfStrings {
    public static void main(String[] args) {
        String str="Hello";
        String rev="";

        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("reverse String of "+str+" is "+rev);
        System.out.println((rev.equals(str))?str+" is a Palindrome":str+" is not a Palindrome");
    }
}
