package oops.programs;

import oops.classes.Customer;

public class CustomerCalling {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.showData();
        Customer customer1=new Customer("Rohan",78641);
        customer1.showData();

    }
}
