package collection_frameworks.linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist_functions {
    public static void main(String[] args) {
        LinkedList<String> months=new LinkedList<>();

        months.add("jan");
        months.add("feb");
        months.add("mar");
        months.add("jan");
        months.add(null);
        months.get(1);
        months.remove(3);
        months.set(3,"april");
        System.out.println(months);
    }
}
