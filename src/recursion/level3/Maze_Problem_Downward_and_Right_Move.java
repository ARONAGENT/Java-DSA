package recursion.level3;

public class Maze_Problem_Downward_and_Right_Move {
    public static int calcPath(int i,int j,int m,int n){
        if(i==n || j==m) {
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downPath=calcPath(i+1,j,n,m);
        int rightPath=calcPath(i,j+1,n,m);
        return downPath+rightPath;

    }
    public static void main(String[] args) {
       int total= calcPath(0,0,3,3);
        System.out.println(total);
    }
}
