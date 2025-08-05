package BackTracking;

public class TotalPermutations {
    public static void printPermutations(String str, String ans) {
        // base condition
        if (str.length() == 0) {
            System.out.println(ans);

            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i + 1);

            printPermutations(NewStr, ans + ch);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
