package Array2D;

public class Search_in_Matric {

    public static boolean staireSearching(int arr[][], int key){
        int row = 0, col = arr[0].length-1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == key) {
                System.out.println("Key at index : ("+row+","+col+")");
                return true;
            }
            
            else if(key > arr[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Key not found");
        return false; 
    }

    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,31,33},
                        {38, 42, 46, 55}};
        staireSearching(arr, 35);
    }
}
