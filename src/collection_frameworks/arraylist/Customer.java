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

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_nm() {
        return cust_nm;
    }

    public void setCust_nm(String cust_nm) {
        this.cust_nm = cust_nm;
    }

    public String getPurchase_prod() {
        return purchase_prod;
    }

    public void setPurchase_prod(String purchase_prod) {
        this.purchase_prod = purchase_prod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

