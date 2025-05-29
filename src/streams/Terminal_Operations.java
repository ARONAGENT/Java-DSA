package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Terminal_Operations {
    public static void main(String[] args) {
        List<Integer> nums= List.of(10, 23, 45, 65, 32, 89, 76, 56, 43, 90, 99, 13, 3, 7, 9);

        // foreach
        System.out.println("----foreach -----");
        nums.stream().forEach(System.out::println);

        //collect
        System.out.println("-----collect-----");
        System.out.println(nums.stream().filter(n-> n<10).collect(Collectors.toList()));

        // count
        System.out.println("---count---");
        System.out.println(nums.stream().count());

        // reduce
        System.out.println("----reduce----");
        System.out.println("--calculate sum ");
        System.out.println(nums.stream().reduce(Integer::sum));
        System.out.println("--calculate max element ");
        System.out.println(nums.stream().reduce(Integer::max));
        System.out.println("--calculate min element ");
        System.out.println(nums.stream().reduce(Integer::min));


        //any match
        System.out.println("----any match-----");
        System.out.println(nums.stream().anyMatch(n-> n<5));

        // all match
        System.out.println("-----all match-----");
        System.out.println(nums.stream().allMatch(n -> n>20));

        // find first
        System.out.println("----find first-----");
        System.out.println(nums.stream().findFirst());
    }
}
