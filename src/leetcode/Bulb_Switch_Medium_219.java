package leetcode;
// here the perfect squares are the only case that they have odd multiples of numbers
// whereas the other numbers have even multiple of numbers
// ex 12 has multiples of [1,2,3,4,6,12] which are even multiple
// and 16 has multiples of [1,2,4,8,16] which are odd multiples
public class Bulb_Switch_Medium_219 {
    public static int bulbSwitch(int n) {
        int count = 0;
        int i = 1;
        while (i * i <= n) {
            count++;
            i++;
        }
        return count;

    }

    public static void main(String[] args) {
        int ans=bulbSwitch(5);
        System.out.println(ans);
    }
}

