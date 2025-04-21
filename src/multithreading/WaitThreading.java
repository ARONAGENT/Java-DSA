package multithreading;
class Hello extends Thread{
    public void run(){
        System.out.println("Start the Thread .....");
        for (int i = 0; i <10 ; i++) {
            System.out.println("Welcome to Java Programming ..."+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("terminate Thread .... ");
    }
}
public class WaitThreading {
    public static void main(String[] args) {
        Thread t1=new Thread(new Hello());
        t1.start();

    }
}
