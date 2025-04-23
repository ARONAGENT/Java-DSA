package collection_frameworks.vector;

import collection_frameworks.arraylist.Customer;

import java.util.Vector;

public class Vector_Objects {
    public static void main(String[] args) {
        Customer c1=new Customer(1,"Joe root","Tourist Bag",23456);
        Customer c2= new Customer(2,"Ben stokes","Trimmer",45);
        Customer c3=new Customer(3,"Virat Kolhi","Bat",4500);

        Vector<Customer> customerVector=new Vector<>();
        customerVector.add(c1);
        customerVector.add(c2);
        customerVector.add(c3);
        System.out.println(customerVector);
        Customer customer;
        java.util.Iterator<Customer> iterator=customerVector.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            customer = iterator.next();
            System.out.println(customer.getCust_nm()+" | "+customer.getPurchase_prod());
        }

    }
}
