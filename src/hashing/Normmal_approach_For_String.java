package hashing;

public class Normmal_approach_For_String {
    static int normal_approach(String s,char c){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==c){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="abaacs";

         char c='c';

        System.out.println(normal_approach(s,c));

    }
}
