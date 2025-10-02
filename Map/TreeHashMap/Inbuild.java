package TreeHashMap;

import java.util.TreeMap;

public class Inbuild {
    public static void main(String[] args) {
        TreeMap<String, Integer> thm = new TreeMap<>();
        // It uses RB tree data structure with inner BST (self balencing tree) algorithm
        // to implement TreeMap
        // It's time complexity is O(log n) due to sorting on keys
        thm.put("India", 50);
        thm.put("Nepal", 20);
        thm.put("China", 100);
        thm.put("Pakistan", 10);

        System.out.println(thm);
        System.out.println(thm.containsKey("China"));
        System.out.println(thm.size());
        System.out.println(thm.remove("China"));
        System.out.println(thm.containsKey("China"));
    }
}
