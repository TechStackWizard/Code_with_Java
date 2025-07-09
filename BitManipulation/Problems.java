package BitManipulation;

public class Problems {
    public static Boolean checkPowerOfTwo(int n){
        // Method 1 using Bit Manipulation
        // return n>0 && (n & (n-1)) == 0;

        // Method 2 using loops 
        if(n<=0) return false;

        while(n%2 == 0){
            n /= 2;
        }
        return n==1;
    }
    public static int countSetBits(int n){
        int count = 0;
        
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }



    public static void main(String[] args) {
        System.out.println(checkPowerOfTwo(0));
        System.out.println(countSetBits(7));
    }
}
