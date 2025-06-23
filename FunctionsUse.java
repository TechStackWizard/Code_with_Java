import java.util.Scanner;
import java.math.*;

public class FunctionsUse {
    public static void Greet() {
        System.out.println("Hello World");
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        if (n == 0)
            return fact;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i=2; i<=n; i++){
    //         if(n%i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    // alternate for finding prime
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){

            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    // number of primes in range
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)) System.out.println(i);
        }
    }

    public static void main(String args[]) {
        // Greet();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of n and r for calculate[nCr]");
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("Sum is : " + sum);

        // int res = factorial(5);
        // System.out.println("Factorial is : "+res);

        // if (n >= r) {
        //     float binomialCoeffi = factorial(n) / (factorial(r) * factorial(n - r));
        //     System.out.println(binomialCoeffi);
        // } else {
        //     System.out.println("n must be greater than r for calculate Binomial Coefficent[nCr]");
        // }

        // System.out.println(isPrime(4));
        
primeInRange(12);
    }
}