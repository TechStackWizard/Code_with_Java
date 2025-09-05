import java.util.ArrayList;
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

        int freq[] = new int[maxEle + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[arr[i]]++;
        }

        // for (int i = 0; i < freq.length; i++) {
        // System.out.println(freq[i]);
        // }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                System.out.println(i);
            }
        }

    }
}
