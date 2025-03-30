package recursion.level2;

public class Subsequences {
    public static void subsequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char  currChar=str.charAt(idx);
        //add option
        subsequences(str,idx+1,newString+currChar);
        // do not  option
        subsequences(str,idx+1,newString);
    }
    public static void main(String[] args) {
        String str="abc";
        subsequences(str,0,"");
    }
}
