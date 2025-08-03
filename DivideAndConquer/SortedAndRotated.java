package DivideAndConquer;

import java.time.LocalTime;

public class SortedAndRotated {
    public static int findIndex(int arr[], int tar, int si, int ei) {

        // find the line
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // mid on line 1
        if (arr[si] <= arr[mid]) {
            // case a: l1 left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return findIndex(arr, tar, si, mid - 1);
            }
            // case b: mid right
            else {
                return findIndex(arr, tar, mid + 1, ei);
            }
        }

        // mid on l2
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return findIndex(arr, tar, mid + 1, ei);
            } else {
                return findIndex(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 3;

        System.out.println(LocalTime.now());
        System.out.println(findIndex(arr, target, 0, arr.length - 1));
        System.out.println(LocalTime.now());

    }
}
