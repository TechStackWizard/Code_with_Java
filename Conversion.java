import java.math.*;

public class Conversion{
    public static String Reverse(String str){
        String res = "";
        for(int i=str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }
        return res;
    }

    public static String DecimalToBinary(int num){
        String localRes = "";
        while(num > 0){
            int rem = num%2;
            localRes += rem;
            num /= 2;
        }
        String res = Reverse(localRes);
        return res;
    }

    public static int BinaryToDecimal(int num){
        int pow = 0;
        int dec = 0;
        while(num > 0){
            int lastDigit = num%10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            num /= 10;
        }
        return dec;
    }


    public static void main(String[] args) {
        // System.out.println(DecimalToBinary(12));
        System.out.println(BinaryToDecimal(1111));
    }
}