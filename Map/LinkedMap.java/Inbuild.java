import java.util.LinkedHashMap;

public class Inbuild {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // In this maping the Dobule LinkedList Data Structure is using;
        lhm.put("India", 50);
        lhm.put("Nepal", 20);
        lhm.put("China", 100);
        lhm.put("Pakistan", 10);

        System.out.println(lhm);
        System.out.println(lhm.containsKey("China"));
        System.out.println(lhm.size());
        System.out.println(lhm.remove("China"));
        System.out.println(lhm.containsKey("China"));
    }
}
