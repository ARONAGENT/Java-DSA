package collection_frameworks.concurrent_failSafe_failFast;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
// famous class always ask for interviews
// ConcurrentHashMap
public class Concurrent_HashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String > map=new ConcurrentHashMap<>();

        map.put(1,"Rohan");
        map.put(2,"Rahul");
        map.put(3,"Rushikesh");
        map.put(4,"Yash");
        map.put(5,"Athrava");

        System.out.println(map);

        Iterator<Integer> iterator=map.keys().asIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            map.put(6,"Om");
        }

        System.out.println(map);

    }
}
