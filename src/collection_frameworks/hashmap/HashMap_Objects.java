package collection_frameworks.hashmap;

import collection_frameworks.arraylist.Customer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Objects {
    public static void main(String[] args) {

        HashMap<Integer,Customer> customerHashMap=new HashMap<>();
        Customer c1=new Customer(1,"Joe root","Tourist Bag",23456);
        Customer c2= new Customer(2,"Ben stokes","Trimmer",45);
        Customer c3=new Customer(3,"Virat Kolhi","Bat",4500);

        customerHashMap.put(1,c1);
        customerHashMap.put(2,c2);
        customerHashMap.put(3,c3);

        System.out.println(customerHashMap);


        System.out.println("\n🔁 Iterating using entrySet():");
        for (Map.Entry<Integer, Customer> entry : customerHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\n🔁 Iterating only values:");
        for (Customer customer : customerHashMap.values()) {
            System.out.println(customer);
        }

        System.out.println("\n🔁 Iterating with keys and getting values:");
        for (Integer key : customerHashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + customerHashMap.get(key));
        }



    }
}
