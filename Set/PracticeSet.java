package Set;

import java.util.HashMap;
import java.util.HashSet;

public class PracticeSet {
    public static void uniqueElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("Unique elements size is : " + set.size());
    }

    public static void unionIntersection(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            set.add(b[j]);
        }
        // int minLen = a.length>=b.length ? b.length : a.length;
        set.clear();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int count = 0;

        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                // intersection.add(b[i]);
                count++;
                set.remove(b[i]);
            }
        }

        System.out.println("Union is : " + set.size());
        System.out.println("Intersection is : " + count);
    }

    public static void largestSubArr_sum0(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = j - map.get(sum);
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("Largest SubArray of sum is zero => " + len);
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 4, 2, 4, 5, 3, 6, 7, 1 };
        // uniqueElement(arr);

        // int a[] = { 7, 3, 9, 2 };
        // int b[] = { 6, 3, 9, 2, 9, 4, 2 };

        // unionIntersection(a, b);

        int arr[] = { 1, -2, 2, 1, -1 };
        largestSubArr_sum0(arr);

    }
}
