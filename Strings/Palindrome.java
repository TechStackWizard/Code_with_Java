public class Palindrome{
    public static String reverseStr(String str){
        String revStr = "";


        return revStr;
    }

    public static Boolean isPalindrome(String str){
        int n = str.length();
        int start = 0, last = n-1;
        while(start < n/2 &&  last > n/2){
            if(str.charAt(start) != str.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
    public static void main(String[] args) {
        Boolean res = isPalindrome("abccbba");
        if(res) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}