public class Power{
    // public static int powerOfN(int x, int n){
    //     // It has O(n) time complexity
    //     // if(n == 0){
    //     //     return 1;
    //     // }

    //     // int power = x * powerOfN(x , n-1);

    //     // return power;

    // }

    public static int optimizedPower(int x, int n){
        if(n == 0) return 1;

        int halfPow = optimizedPower(x, n/2);
        int power = halfPow * halfPow;
        
        if(n%2 != 0){
            power = x * power;
        } 

        return power;
    }

    public static void main(String []args){
        // System.out.println(powerOfN(2, 5));
        
        System.out.println(optimizedPower(2, 5));
        
    }

}