package ArrayListPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    public static boolean isMonotonic(ArrayList<Integer> list) {
        int n = list.size();
        boolean inc = false;
        boolean dec = false;
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                inc = true;
            }
            if (list.get(i) > list.get(i + 1)) {
                dec = true;
            }
        }
        return inc || dec;
    }

    public static ArrayList<Integer> lonlyNoArr(ArrayList<Integer> list) {
        Collections.sort(list);
        // System.out.println(list);
        ArrayList<Integer> lonelyEle = new ArrayList<>();

        if (list.size() == 1) {
            lonelyEle.add(list.get(0));
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) + 1 < list.get(i) && list.get(i) < list.get(i + 1) - 1) {
                lonelyEle.add(list.get(i));
            }
        }

        if (list.size() > 1) {
            if (list.get(0) + 1 < list.get(1)) {
                lonelyEle.add(list.get(0));
            }
            if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                lonelyEle.add(list.get(list.size() - 1));
            }
        }

        return lonelyEle;
    }

    public static int mostFrequent(ArrayList<Integer> list, int k) {
        int[] result = new int[1000];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == k && list.size() > i + 1) {
                result[list.get(i + 1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(2);
        list.add(200);
        list.add(1);
        list.add(100);

        // list.add(5);
        // list.add(8);

        // System.out.println(isMonotonic(list));
        // System.out.println(lonlyNoArr(list));
        System.out.println(mostFrequent(list, 2));
    }
}
