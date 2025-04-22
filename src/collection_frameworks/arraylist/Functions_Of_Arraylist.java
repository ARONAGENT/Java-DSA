package collection_frameworks.arraylist;

import java.util.ArrayList;
// arraylist
// 1.maintain insertion sequence
// 2.duplicates are allowed
// 3.null values are allowed
// 4.retrieve and remove the element from index
// 5.insert the element at anywhere

public class Functions_Of_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Rohan");
        names.add("Rahul");
        names.add("Yash");
        names.get(1);
        names.add(0,"Om");
        names.add(null);
        names.add("Rohan");
        names.remove(5);
        int value=names.size();
        System.out.println(value);
        names.addFirst("Athrava");
        boolean val=names.contains("Yash");
        System.out.println(val);
        //        names.clear();
        names.set(1,"Om kale");
        System.out.println(names);

    }
}
