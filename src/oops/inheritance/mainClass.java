package oops.inheritance;

public class mainClass {
    public static void main(String[] args) {
        Two two=new Two();
        int val=two.sum(2,3);
        // here Two obj called One Class method called Single inheritance
        int val2 =two.calSquare(6);
        System.out.println("Sum is "+val);
        System.out.println("Square is "+val2);
    }
}
