package interfaces.basics;

public class T1AndT2Ops implements I1,I2{
    @Override
    public void abc() {
        System.out.println("abc method defined in I1 interface");
    }

    @Override
    public void pqr() {
        System.out.println("pqr method defined in I2 interface");
    }

    public static void main(String[] args) {
        T1AndT2Ops t1AndT2Ops=new T1AndT2Ops();
        t1AndT2Ops.abc();
        t1AndT2Ops.pqr();
    }
}
