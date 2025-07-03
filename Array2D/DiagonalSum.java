package Array2D;

public class DiagonalSum{

    public static void printsDiagonalSum_Matric(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;

        
        // Method 1: Brute force approch :- it's time complexity is (O(n^2));
        // int diagonalSum = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(i == j){
        //             diagonalSum += arr[i][j];
        //         }
        //         else if(i+j == n-1){
        //             if(i == j){
        //                 break;
        //             }
        //             diagonalSum += arr[i][j];
        //         }
        //     }
        // }
        // System.out.println("Diagonal sum is : "+ diagonalSum);

        // Method 2: Calculate sum in linear time;
        int sum = 0;
        for(int i=0; i<n; i++){
            // sum of primary diagonals
            sum += arr[i][i];

            // sum of secondary diagonals
            if(i != n-1-i){
                sum += arr[i][n-1-i];
            }
        }
        System.out.println("Sum of diagonal is : "+sum);

    }
    
    public static void main(String args[]){

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printsDiagonalSum_Matric(arr);
    }
}