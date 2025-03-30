package recursion.level2;

public class Old_phone_keypad_printing {
    public static String[] keypad={".","abc","dhi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printAccordingKeypadNumber(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping =keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printAccordingKeypadNumber(str,idx+1,newString+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="2";
        printAccordingKeypadNumber(str,0,"");
    }
}
