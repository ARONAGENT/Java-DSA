package oops.classes;

public class Customer {
    private String name;
    private double purchaseAmt;

    public Customer(){
        name="";
        purchaseAmt =0.0;
        System.out.println("Empty Constructor is calling");
    }
    public Customer(String name,double purchaseAmt){
        this.name=name;
        this.purchaseAmt =purchaseAmt;
        System.out.println("Parameterized Constructor is calling");
    }

    public void showData(){
        System.out.println("Customer name "+name);
        System.out.println("Customer Purchase Amount "+purchaseAmt);
    }
}
