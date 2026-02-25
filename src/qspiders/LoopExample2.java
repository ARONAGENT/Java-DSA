package qspiders;

public class LoopExample2 {
    public static void main(String[] args) {

        //  A to Z - A-65 , B-66 , C-67 ....
        System.out.println("characters");
        for(char ch='A' ; ch<='Z';ch++){
            System.out.print(ch+" - "+(ch+0)+" ");
        }

        System.out.println();
        //  1 - 100 odd 1,3,5,.....
        System.out.println("Odd Numbers 1 to 100");
        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0)
                System.out.print(i+" ");
        }

        // A C F J O U
        int i=1;
        for(char ch='A' ; ch<='Z';ch+=i){
            System.out.print(ch+" ");
            i++;
        }


    }
}
