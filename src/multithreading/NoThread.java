package multithreading;
// without multithreading......
public class NoThread {
    public void printNumbers(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        NoThread noThread1=new NoThread();
        // object 1 is processing
        noThread1.printNumbers();
        NoThread noThread2=new NoThread();
        // object 2 is processing
        noThread2.printNumbers();
    }
}
