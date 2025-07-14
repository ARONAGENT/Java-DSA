package characters;

import java.io.PrintStream;

public class CharacterArrayIsPalindromeOrNot {
    public static void main(String[] args) {
        char[] arr={'a','b','a'};
        boolean var=true;

        for (int i = 0; i<arr.length ; i++) {
            if(arr[i]!=arr[arr.length-i-1]){
                var=false;
                break;
            }
        }
        System.out.println(var);


    }
}
