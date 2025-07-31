package ArrayListPackage;

import java.util.ArrayList;

public class PairSum2 {
    public static Boolean isPairExists(ArrayList<Integer> list, int target) {
        int n = list.size();
        int lp = 0, rp = 0;

        // Getting Pivot or Breaking point
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                lp = i + 1;
                rp = i;
            }
        }
        // System.out.println("lp : " + lp + "rp : " + rp);
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target)
                return true;

            else if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        // list.add(8);
        // list.add(3);
        // list.add(7);

        // Collections.sort(list);
        System.out.println(isPairExists(list, 12));
    }
}
