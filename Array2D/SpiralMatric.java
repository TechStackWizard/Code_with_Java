package Array2D;
public class SpiralMatric {

    public static void spiralMatricPrint(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;

        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;

        while(startRow <= endRow && startCol <= endCol){

            // top elements
            for(int j=startCol; j<=endCol; j++){
                System.out.print(arr[startRow][j] + " ");
            }
    
            // right elements
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol] + " ");
            }
            // Bottom elements
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(arr[endRow][j] + " ");
            }
    
            // Left elements
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    

    public static void main(String[] args) {
        // int arr[][] = {{1,2,3,4,20},
        //                 {5,6,7,8,30},
        //                 {9,10,11,12,40},
        //                 {13,14,15,16,50},
        //                   {60, 70, 80, 90, 100}};
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        spiralMatricPrint(arr);
    }
}