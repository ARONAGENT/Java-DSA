package oops.final_methods;

public class MainClass {
    public static void main(String[] args) {
        SoftwareStocks s=new SoftwareStocks();
        s.stockAvailable();
        s.welcome();

        ProductsStocks p=new ProductsStocks();
        p.stockAvailable();
        p.welcome();
    }
}
