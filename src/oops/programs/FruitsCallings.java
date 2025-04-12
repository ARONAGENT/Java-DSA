package oops.programs;

import oops.classes.Fruits;

public class FruitsCallings {
    public static void main(String[] args) {
        Fruits fruits=new Fruits();
        String value=fruits.printFruitName("Mango");
        System.out.println(value);
       String value2 =fruits.printFruitName("Apple");
        System.out.println(value2);
    }
}
