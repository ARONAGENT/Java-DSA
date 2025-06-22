package leetcode;

import java.awt.desktop.PreferencesEvent;

public class Question3 {
    public boolean isPowerOf2(int x){
        if(x<1){
            return false;
        }
        while(x%2==0){
            x/=2;
        }
        return x==1;
    }

    public static void main(String[] args) {
        Question3 question3=new Question3();
        boolean val=question3.isPowerOf2(34);
        System.out.println(val);
    }
}
