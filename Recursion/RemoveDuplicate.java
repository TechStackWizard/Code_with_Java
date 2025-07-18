
public class RemoveDuplicate {
    public static void getUniqueStr(String str, int idx, StringBuilder sb, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }

        // Working logic
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            getUniqueStr(str, idx + 1, sb, map);
        } else {
            sb.append(currChar);
            map[currChar - 'a'] = true;
            getUniqueStr(str, idx + 1, sb, map);
        }

    }

    public static void main(String[] args) {
        getUniqueStr("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
}
