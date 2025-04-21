package multithreading;
class Hello1 implements Runnable{

    @Override
    public void run() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello From Aron  .."+i);
        }
    }
}
class Hello2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello From Rohan  .."+i);
        }
    }
}
public class WithRunnable {
    public static void main(String[] args) {
        Thread t1=new Thread(new Hello1());
        Thread t2=new Thread(new Hello2());
        t1.start();
        t2.start();
    }
}
