package collection_frameworks.arraylist;

import java.util.ArrayList;

public class CreateCustomer {
    public static void main(String[] args) {
        Customer c1=new Customer(1,"Joe root","Tourist Bag",23456);
        Customer c2= new Customer(2,"Ben stokes","Trimmer",45);
        Customer c3=new Customer(3,"Virat Kolhi","Bat",4500);

        ArrayList<Customer> customerArrayList=new ArrayList<>();
        customerArrayList.add(c1);
        customerArrayList.add(c2);
        customerArrayList.add(c3);

        for (int i = 0; i < customerArrayList.size(); i++) {
            System.out.println(customerArrayList.get(i));
        }

    }
}
