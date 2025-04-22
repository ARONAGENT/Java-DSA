package collection_frameworks.arraylist;

import java.util.ArrayList;
// arraylist
// 1.maintain insertion sequence
// 2.duplicates are allowed
// 3.null values are allowed
// 4.retrieve and remove the element from index
// 5.insert the element at anywhere
// 6.arraylist are non-synchronized

public class Functions_Of_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        boolean data=names.isEmpty();
        System.out.println(data);
        names.add("Rohan");
        names.add("Rahul");
        names.add("Yash");
        names.get(1);
        names.add(0,"Om");
        names.add(null);
        names.add("Rohan");
        names.remove(5);
        int val=names.size();
        System.out.println(val);
        names.addFirst("Athrava");
        boolean valu=names.contains("Yash");
        System.out.println(valu);
//        names.clear();
        names.set(1,"Om kale");
        System.out.println(names);

    }
}
