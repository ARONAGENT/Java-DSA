package streams;

import java.util.List;

public class BasicStreamOperations {
    public static void main(String[] args) {
        List<Orders> orderList = List.of(
                new Orders(1, "Burger", 2, 15.50),
                new Orders(2, "Pizza", 3, 22.00),
                new Orders(3, "Pasta", 4, 28.75),
                new Orders(4, "Ice Cream", 1, 4.50),
                new Orders(5, "Coffee", 2, 8.25),
                new Orders(6, "Chicken Biryani", 2, 14.00),
                new Orders(7, "Sushi", 2, 19.60),
                new Orders(8, "Paneer Tikka", 3, 18.30),
                new Orders(9, "Tacos", 3, 16.80),
                new Orders(10, "Cheeseburger", 3, 20.10)
        );

        System.out.println(orderList);


//        // initally We do traditional Approach
//        for (int i = 0; i <orderList.size() ; i++) {
//            System.out.println(orderList.get(i));
//        }
//
//        // Or
//        Iterator<Orders> iterator=orderList.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//

        System.out.println();
        // now with the help of Streams we do ->
        System.out.println("With Streams.....");
        orderList.stream().forEach(nm-> System.out.println(nm));

    }
}
