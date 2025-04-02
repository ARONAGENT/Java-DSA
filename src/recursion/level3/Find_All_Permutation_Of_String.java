package recursion.level3;

public class Find_All_Permutation_Of_String {

    public static void permutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            permutation(newString,permutation+currChar);
        }
    }
    public static void main(String[] args) {
        permutation("abc","");
    }
}
/*
* This means:

Start at index 0 → (which is 'a')
End before index 0 → (so, it stops before extracting anything)
Since it never actually includes any characters, it returns an empty string ("").*/