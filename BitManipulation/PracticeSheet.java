package BitManipulation;

public class PracticeSheet {
    public static int findNumOfNum(int x){
        // Method 1
        // int ans = x;
        // for(int i=1; i<x; i++){
        //     ans *= x;
        // }
        // return ans;

        // Method 2 Bit Manipulation
        int ans = 1;
        int  n = x;
        while(n > 0){
            if((n & 1) != 0){
                ans = x * ans;
            }
            x = x * x;
            n = n>>1;            
        }
        return ans;
    }

    public static void swap2Num(int a, int b){
        System.out.println("Given value a "+a+ " and b "+ b );
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swaped a "+a+" and b "+b);
    }

    public static void main(String[] args) {
        System.out.println(findNumOfNum(3));
        swap2Num(4,8);      
    }
}
