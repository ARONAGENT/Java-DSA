package leetcode;

public class Water_Bottles_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            ans += newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;

    }

    public static void main(String[] args) {
        Water_Bottles_1518 waterBottles1518=new Water_Bottles_1518();
        int result=waterBottles1518.numWaterBottles(15,4);
        System.out.println(result);
    }
}