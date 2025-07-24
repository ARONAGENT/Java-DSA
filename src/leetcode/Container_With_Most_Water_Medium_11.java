package leetcode;

public class Container_With_Most_Water_Medium_11 {
    public static int mostWaterCapacity(int[] height){
        int start=0;
        int end=height.length-1;
        int maxcap=0;

        while (start<end){
            int h=Math.min(height[start],height[end]);
            int width=end-start;
            int currcap=h*width;
            maxcap=Math.max(currcap,maxcap);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxcap;
    }

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int maximum=mostWaterCapacity(height);
        System.out.println("Maximum Capacity of water "+maximum);
    }
}
