package oops.inheritance;

public class mainClass {
    public static void main(String[] args) {
       One obj=new One();
        // here One class Inherits three and Two class also inherits Three called Hierarchical Inheritance
        int val1=obj.calSquare(6);
        //int val=obj.sum(2,3);
        obj.printName("Rohan");
        Two obj2=new Two();
        obj2.printName("Rahul");
        int val2=obj2.sum(3,4);
        // obj2.calSquare(8);

        //One class Method
        System.out.println(val1);
        // Two Class Method
        System.out.println(val2);
    }
}
