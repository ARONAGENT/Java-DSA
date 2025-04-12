package oops.classes;
/*
* constructor
- it runs automatically when object is created
- it initializes the objects
- assign initial values to data members
- allocate memory to the object
- constructor function must be declared as public
- it should not have any return type
- name must be same as that of the class

- it is not compulsory to create a constructor
- default constructor
* */
public class Fruits {
    public Fruits(){
        System.out.println("Fruits Class Constructor is Calling");
    }
    public String printFruitName(String name){
        System.out.println("Your Fruit name is "+name);
        return "Successfully Print Names with name :"+name;
    }
}
