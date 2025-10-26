package advanceStrem;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateSumOfProductsAccordingToCategory {
    public static void main(String[] args) {
        Product product1=new Product("Rohan","Electronics",4500);
        Product product2=new Product("Rahul","Food",500);
        Product product3=new Product("Om","Food",9800);
        Product product4=new Product("Athrava","Electronics",5000);

        List<Product> productList=List.of(product1,product2,product3,product4);
        //  Group by category and sum total price
        Map<String, Double> ans= productList
                .stream()
                .collect(Collectors.groupingBy(product -> product.category,
                        Collectors.summingDouble(product -> product.price)
                ));
        System.out.println(ans);
    }
}
