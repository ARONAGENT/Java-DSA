package multithreading;

public class WithThread extends Thread{
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }

    public static void main(String[] args) {
       Thread thread1=new Thread(new WithThread());
       Thread thread2=new Thread(new WithThread());

        System.out.println("thread one is Processing....");
        thread1.start();
        System.out.println("thread two is Processing....");
        thread2.start();
    }
}
