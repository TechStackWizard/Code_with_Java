import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {

        // int num = 290;
        // String numStr = Integer.toString(num);

        // for (char s : numStr.toCharArray()) {
        // if (s % 2 == 0) {
        // System.out.println("even" + s);
        // } else {
        // System.out.println("odd" + s);
        // }

        // }
        // int n = 3;
        // List<List<String>> twoDList = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // twoDList.add(new ArrayList<>());
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // twoDList.get(j).add(".");
        // }
        // }
        // System.out.println(twoDList);

        int arr[] = { 1, 2, 1, 2, 3, 4, 5 };
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxEle <= arr[i]) {
                maxEle = arr[i];
            }
        }
        // System.out.println(maxEle);

        int freq[] = new int[maxEle + 1];
        // System.out.println(freq.length);

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // for (int i = 0; i < freq.length; i++) {
        // System.out.println(freq[i]);
        // }

        // Counting short Methodology
        // for (int i = 1; i < freq.length; i++) {
        // while (freq[i] != 0) {
        // System.out.print(i + " ");
        // freq[i]--;
        // }
        // }

        // for (int i = 0; i < freq.length; i++) {
        // if (freq[i] == 2) {
        // System.out.println(i);
        // }
        // }

        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int k = 0; k < i; k++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j < n - i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Counting short using in-build function
        String str1 = "abc";
        String str2 = "cba";

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        System.out.println(str1Arr);
        System.out.println(str2Arr);

        if (str1Arr.equals(str2Arr)) {
            System.out.println("Strings are anagram to each other");
        } else {
            System.out.println("Strings are not anagram to each other");

        }
    }
}
