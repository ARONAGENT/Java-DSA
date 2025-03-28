package recursion.level2;

public class MoveAll_X_to_end {
    public static void newStringOfX(String str,int idx,int count,String newString){
        if(idx== str.length()){
            for(int i=0;i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }

        if(str.charAt(idx) == 'x'){
            count++;
            newStringOfX(str,idx+1,count,newString);
        }else {
            newString+=str.charAt(idx);
            newStringOfX(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String s="abcxxbsbaxxbsabxx";
        newStringOfX(s,0,0,"");
    }
}
