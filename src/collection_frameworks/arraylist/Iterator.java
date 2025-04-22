package collection_frameworks.arraylist;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Rahul", "car", 897650);
        Customer c2 = new Customer(1, "Rohan", "laptop", 65999);
        Customer c3 = new Customer(1, "Om", "Bike", 125000);

        ArrayList<Customer> custList = new ArrayList<>();
        custList.add(c1);
        custList.add(c2);
        custList.add(c3);
        java.util.Iterator<Customer> iterator = custList.iterator();
        Customer obj;

        while (iterator.hasNext()) {
            //System.out.println(iterator.next().getCust_nm()+" | "+iterator.next().getPurchase_prod()); un relevant result
            obj = iterator.next();
            System.out.println(obj.getCust_nm() + " | " + obj.getPrice());
        }
    }
}
