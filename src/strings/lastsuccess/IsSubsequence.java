package strings.lastsuccess;

public class IsSubsequence {
    static boolean isSubsequence(String s,String t){
        int p=0,q=0;
        String ans="";
        if(s.isEmpty()){
            return false;
        }
        for(int i=0;i<t.length();i++){
            char first=s.charAt(p);
            char second=t.charAt(q);
            if(first==second){
                p++;
                q++;
                ans=ans+first;
            }else{
                q++;
            }
        }
        return ans.equals(s);
    }

    static boolean isSubsequence2(String s, String t) {
        int p = 0, q = 0;
        String ans = "";
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() == 1) {
            for (int i = 0; i < t.length(); i++) {
                char ch=s.charAt(0);
                char ch2=t.charAt(i);
                if(ch==ch2){
                    return true;
                }
            }
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            char first = s.charAt(p);
            char second = t.charAt(q);
            if (first == second) {
                p++;
                q++;
                ans = ans + first;
            } else {
                q++;
            }
        }
        return ans.equals(s);
    }
    public static void main(String[] args) {
        String s="b";
        String t= "ahbgdc";
        System.out.println(isSubsequence2(s,t));
    }
}
