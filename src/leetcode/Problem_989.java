package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_989 {

    public List<Integer> problem_989(int [] num,int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length-1;
        int carry = 0;
        while (p>=0 || k>0){
            int numval=0;
            if(p>=0){
                numval=num[p];
            }
            int d=k%10;
            int sum = numval+d+carry;
            int digit=sum%10;
            carry=sum/10;
            ans.add(digit);
            p--;
            k/=10;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Problem_989 problem989= new Problem_989();

        int[] num ={2,3,1,0};
        int k=200;
        List<Integer> ans=problem989.problem_989(num,k);
        System.out.println(ans);
    }
}
