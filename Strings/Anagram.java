import java.io.CharArrayReader;
import java.util.Arrays;

public class Anagram{
    public static void checkAnagram(String str1, String str2){

        String Nstr1 = new String(str1);
        String Nstr2 = new String(str2);

        if(str1.length() == str2.length()){
            char[] charArray1 = Nstr1.toCharArray();
            char[] charArray2 = Nstr2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnaram = Arrays.equals(charArray1, charArray2);

            if(isAnaram){
                System.out.println(str1 + " and " + str2 + " are anagram string");
            }
            else{
                System.out.println(str1 + " and " + str2 + " are not anagram string");
            }
        }
        else{
            System.out.println("Not possible bcz length are not equal");
        }
    }


    public static void main(String []args){
        
        checkAnagram("race", "care");
    }
}