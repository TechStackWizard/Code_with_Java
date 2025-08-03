package DivideAndConquer;

public class BinarySearch {
    public static int getIndex(int arr[], int tar, int si, int ei) {

        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar)
            return mid;

        if (arr[mid] > tar) {
            return getIndex(arr, tar, si, mid - 1);
        } else {
            return getIndex(arr, tar, mid + 1, ei);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int tar = 1;

        System.out.println(getIndex(arr, tar, 0, arr.length - 1));
    }
}
