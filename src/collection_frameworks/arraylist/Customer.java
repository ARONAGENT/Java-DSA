package collection_frameworks.arraylist;

public class Customer {
    private int  cust_id;
    private String  cust_nm;
    private String purchase_prod;
    private double price;

    public Customer(int cust_id, String cust_nm, String purchase_prod, double price) {
        this.cust_id = cust_id;
        this.cust_nm = cust_nm;
        this.purchase_prod = purchase_prod;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", cust_nm='" + cust_nm + '\'' +
                ", purchase_prod='" + purchase_prod + '\'' +
                ", price=" + price +
                '}';
    }
}

