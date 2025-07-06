package Array2D;

public class TransposeMat {

    public static void printTransposeMatric(int arr[][]){
        int n=arr.length;
        int m = arr[0].length;
        int transMat[][] = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transMat[j][i] = arr[i][j];
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(transMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                        {4,5,6}};
        printTransposeMatric(arr);
    }
}
