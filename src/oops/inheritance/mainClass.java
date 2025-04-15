package oops.inheritance;

public class mainClass {
    public static void main(String[] args) {
        Three obj= new Three();
        // here Three class Can Run Two class methods as well as one Class Methods called Multilevel Inheritance
        int val=obj.sum(2,3);
        int val2 =obj.calSquare(6);
        obj.printName("Rohan");
        System.out.println("Sum is "+val);
        System.out.println("Square is "+val2);
    }
}
