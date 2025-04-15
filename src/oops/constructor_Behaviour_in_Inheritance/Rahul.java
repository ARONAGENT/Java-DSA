package oops.constructor_Behaviour_in_Inheritance;

//The super keyword in object-oriented programming in  Java
// is used to access methods or constructors of the parent (super) class.
// here  the parent or super class is Rohan and super is calling Rohan's Constructor
// via Rahul's Constructor hence while running its display opposite output
/*
* 🔁 Why is the output in this order?
When Rahul obj = new Rahul(); is called:

Rahul() constructor is invoked.

First line of Rahul() is super(); → this calls Rohan() constructor.

So, "Rohan constructor" prints first.

Then "Rahul constructor" prints.
* */
public class Rahul extends Rohan{
    public Rahul(){
        super("AronAgent");
        System.out.println("Rahul Constructor Running ...(derived class).");
    }
    public void product(){
        System.out.println("Rahul Product is Laptops  ");
    }
}
