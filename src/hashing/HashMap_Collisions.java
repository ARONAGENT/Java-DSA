package hashing;

import java.util.HashMap;

public class HashMap_Collisions {
    public static void main(String[] args) {
        HashMap<Object, String> map = new HashMap<>();

        // Two keys with same hash code
        Object key1 = "FB";
        Object key2 = "Ea";

        // Print their hash codes
        System.out.println("HashCode of \"" + key1 + "\": " + key1.hashCode());
        System.out.println("HashCode of \"" + key2 + "\": " + key2.hashCode());

        map.put(key1, "Value1");
        map.put(key2, "Value2");

        // Fetch values
        System.out.println("Value for " + key1 + ": " + map.get(key1));
        System.out.println("Value for " + key2 + ": " + map.get(key2));
    }
}
