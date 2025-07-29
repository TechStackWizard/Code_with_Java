package ArrayListPackage;

import java.util.ArrayList;

public class ContainerWithMostWater {

    public static void maxWaterArea(ArrayList<Integer> list) {
        // Brute force approch
        // int maxWater = 0;
        // for (int i = 0; i < list.size(); i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // int width = j - i;
        // int height = Math.min(list.get(i), list.get(j));
        // int water = width * height;

        // maxWater = Math.max(maxWater, water);

        // }
        // }
        // System.out.println(maxWater);

        // 2 poiter Approch [O(n)]
        int l = 0;
        int r = list.size() - 1;
        int maxWater = 0;
        while (l <= r) {
            int ht = Math.min(list.get(l), list.get(r));
            int wd = r - l;
            int water = ht * wd;
            maxWater = Math.max(maxWater, water);

            if (list.get(l) < list.get(r)) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(maxWater);

    }

    public static void main(String[] args) {
        // int height[] = {1,8,6,2,5,4,8,3,7};
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

        maxWaterArea(list);
    }

}
