package ArrayListPackage;

import java.util.ArrayList;
import java.util.Collections;

public class PairSum {
    public static Boolean isPairExist(ArrayList<Integer> list, int target) {
        int l = 0;
        int r = list.size() - 1;
        while (l <= r) {
            int sum = list.get(l) + list.get(r);
            if (sum == target)
                return true;
            else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(isPairExist(list, 10));
    }
}
