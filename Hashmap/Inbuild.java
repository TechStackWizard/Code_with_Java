package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class Inbuild {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Adding or Inserting => O(1)
        hm.put("India", 50);
        hm.put("Nepal", 20);
        hm.put("China", 100);
        hm.put("Pakistan", 10);

        // Creating a Set for collection of keys
        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("Key=" + k + ", " + "Value=" + hm.get(k));
        }

    }
}
