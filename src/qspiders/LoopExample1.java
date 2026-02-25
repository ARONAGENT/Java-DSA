package qspiders;

public class LoopExample1 {
    public static void main(String[] args) {
        System.out.println("exec starts");
        int i=1;
        for (System.out.println("initialization");i<=4; System.out.println(i+" updation")){
            System.out.println(i+" condition true");
            System.out.println(i+" loop has performed tasks \n" );
            i++;
        }
        System.out.println("execution ends");
    }

    // output
    /*
        exec starts
        initialization
        1 condition true
        1 loop has performed tasks

        2 updation
        2 condition true
        2 loop has performed tasks

        3 updation
        3 condition true
        3 loop has performed tasks

        4 updation
        4 condition true
        4 loop has performed tasks

        5 updation
        execution ends

    * */
}
