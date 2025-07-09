package BitManipulation;

public class BitOperations {

    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        return n & bitMask;
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int keyBit){
        // Method 1
        // if(keyBit == 0){
        //     return clearIthBit(n, i);
        // } else{
        //     return setIthBit(n, i);
        // }

        // Method 2
        n = clearIthBit(n, i);
        int bitMask = keyBit << i;
        return n | bitMask;
    }

    public static int clearLastIthBits(int n, int i){
        for(int at=0; at<i; at++){
            n = clearIthBit(n, at);
        }
        return n;
    }

    public static int clearIBitRange(int n, int i, int j){
        int a = ((~0) & (1 << j+1));
        int b = (1 << i) - 1;

        return n & (a | b);
    }

    public static void main(String[] args) {
        // System.out.println(getIthBit(5, 2));
        // System.out.println(setIthBit(5, 1));
        // System.out.println(clearIthBit(13, 2));
        // System.out.println(updateIthBit(10, 3, 0));
        // System.out.println(clearLastIthBits(15, 2));

        System.out.println(clearIBitRange(10, 2, 4));
        
        
    }
}
