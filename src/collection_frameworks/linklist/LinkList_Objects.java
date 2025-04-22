package collection_frameworks.linklist;

import collection_frameworks.arraylist.Customer;

import java.util.LinkedList;

public class LinkList_Objects {
    public static void main(String[] args) {
        Customer c1=new Customer(1,"Joe root","Tourist Bag",23456);
        Customer c2= new Customer(2,"Ben stokes","Trimmer",45);
        Customer c3=new Customer(3,"Virat Kolhi","Bat",4500);

        LinkedList<Customer> customers=new LinkedList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

//        for (int i = 0; i <customers.size() ; i++) {
//            System.out.println(customers.get(i));
//        }

        // using iterator
        java.util.Iterator<Customer> iterator= customers.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


        // new way for printing elements
        for (Customer customer : customers) System.out.println(customer);
    }





}
