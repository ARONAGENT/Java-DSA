package oops.abstract_methods;
// Main class Runnable Program
public class MainClass {
    public static void main(String[] args) {
       /*
       * Abstract Class – Object Restriction
        1.Products p = new Products(); → ❌ we can't create an object of Products class because it's an abstract class.
        2.Not being able to create an object means we can't directly call any methods defined in the abstract class.
        3.So, we use inheritance — the abstract class is extended by derived classes like Laptops and Mobiles.
        4.These derived classes provide implementation for abstract methods,
         and we create objects of these classes to access the methods.
       * */
        Mobiles m=new Mobiles();
        m.welcome();
        m.prodNm("Realme 7 pro");
        Laptops l=new Laptops();
        l.welcome();
        l.prodNm("Asus i5 13 gen evo ");
    }
}
