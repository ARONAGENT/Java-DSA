package oops.inheritance;

// here Two class inherits the One class which means that Two class can used One class methods;
// Single Inheritance ->Single Inheritance is a type of inheritance in object-oriented programming
// where a child (derived) class inherits from only one parent (base) class.
public class Two extends One{
    public int sum(int a,int b){
        return a+b;
    }
}
