public class Initiate{

    public static void printDecNum(int n){
        if(n == 1){ // Base condition
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        printDecNum(n-1);
    }

    public static void printIncNum(int n){
      
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printIncNum(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){
        if(n == 0) return 1;
        int fnm1 = factorial(n-1);
        int res = n * fnm1;

        return res;
    }

    public static int sumOfN(int n){
        if(n == 1) return 1;

        int fnm1 = sumOfN(n-1);
        int sum = n + fnm1;

        return sum;
    }

    public static int fibo(int p){
        if(p == 1 || p ==2) return p-1;

        int res = fibo(p-1) + fibo(p-2);

        return res;
    }

    public static Boolean isSorted(int arr[], int i){
        //Using Recursion
        if(i == arr.length-1) return true;

        if(arr[i] > arr[i+1]) return false;

        return isSorted(arr, i+1);

        //Using loop
        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i] > arr[i+1]) return false;
        // }
        // return true;

        // while(i < arr.length-1){
        //     if(arr[i] > arr[i+1]) return false;
        //     i++;
        // }
        // return true;

    }

    public static int firstOccured(int arr[], int i, int ele){
        if(i == arr.length)  return -1;
        
        if(arr[i] == ele) return i;

        
        return firstOccured(arr, i+1, ele);
    }

    public static int lastOccurance(int arr[], int i, int key){
        if(i == arr.length) return -1;

        int isFound = lastOccurance(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        // print number in decreasing order
        // int num = 10;
        // printDecNum(num);
        // System.out.println();
        // printIncNum(num);
        // System.out.println(factorial(5));
        // System.out.println(sumOfN(5));
        // System.out.println(fibo(50));
        int arr[] = {1,2,3,2,6,4};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccured(arr, 0, 4));
        System.out.println(lastOccurance(arr, 0, 8));
        
    }
}