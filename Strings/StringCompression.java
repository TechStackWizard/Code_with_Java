public class StringCompression {

    public static void printCompressedStr(String str) {
        StringBuilder sb = new StringBuilder("");
        

        for (int i = 0; i < str.length(); i++) {
            Integer count = 0;
            char ch = str.charAt(i);

            while(i < str.length() && str.charAt(i) == ch){
                count++;
                i++;
            }

            if(count > 1){
                sb.append(ch);
                sb.append(count.toString());
                i--;
            }

            else{
                sb.append(ch);
            }

        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "aaabbb";
        printCompressedStr(str);
    }
}
