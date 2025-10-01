import java.util.HashMap;

public class PracticeProblems {
    public static void checkFrquencyOccur(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }

        for (int key : hm.keySet()) {
            if (hm.get(key) > arr.length / 3) {
                System.out.print(key + " ");
            } else {
                continue;
            }
        }
    }

    public static boolean validAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        // int arr[] = { 1, 3 };
        // checkFrquencyOccur(arr);

        String s = "tulip";
        String t = "lipid";
        System.out.println(validAnagram(s, t));
    }
}
