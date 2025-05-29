package streams;

import oops.programs.ConstructorCallingProgram;

import java.util.List;
import java.util.stream.Collectors;

public class Intermediate_Operations {
    public static void main(String[] args) {
        List<Integer> nums=List.of(12,34,18,7,12,58,67,17,18,46,5,6,7);
        System.out.println(nums);


        // filter -> used for check the  conditions
        System.out.println("----Filter----");
        System.out.println("Printing Numbers Less Than 50 ---");
        nums.stream().filter(n-> n < 20).forEach(System.out::println);

        // map -> used for transform elements
        System.out.println("------Map------");
        System.out.println("Print Square of elements in List");
        List<Integer> sq= nums.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(sq);

        // sorted -> sorts the list according to conditions
        System.out.println("----sorted-----");
        System.out.println("Printing Sorted Numbers");
        System.out.println(nums.stream().sorted().collect(Collectors.toList()));
        System.out.println("Printing Sorted Numbers less than 50");
        System.out.println(nums.stream().filter(n-> n<50).sorted().collect(Collectors.toList()));


        // distinct -> collects distinct elements
        System.out.println("-----distinct-----");
        System.out.println(nums.stream().distinct().collect(Collectors.toList()));

        // limit
        System.out.println("--------limit-------");
        System.out.println("Print only 5 elements");
        System.out.println(nums.stream().limit(5).collect(Collectors.toList()));
        System.out.println("Print Distinct 5 sorted elements of sum");
        System.out.println(nums.stream().distinct().sorted().limit(5).reduce(Integer::sum));

        // skip -> skip the elements
        System.out.println("----skip-----");
        System.out.println("Skip 5 elements...");
        System.out.println(nums.stream().skip(5).collect(Collectors.toList()));




    }
}
