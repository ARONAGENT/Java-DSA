package recursion.level2;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src,String helper,String des){
        if(n==1){
            System.out.println("Transfer "+n+" disk from "+src+" destination "+des);
            return;
        }
        towerOfHanoi(n-1,src,des,helper);
        System.out.println("Transfer "+n+" disk from "+src+" destination "+des);
        towerOfHanoi(n-1,helper,src,des);
    }
    public static void main(String[] args) {
        towerOfHanoi(3,"s","h","d");
    }
}
