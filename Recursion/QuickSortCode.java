

public class QuickSortCode {
    public static void quickSort(int arr[], int si,int ei){
        if(si >= ei) return ;

        int pivot = partition(arr, si, ei);
        quickSort(arr, si, pivot-1);
        quickSort(arr, pivot+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int piv = arr[ei];
        int i = si-1;
        
        for(int j=si; j < ei; j++){
            if(arr[j] <= piv){
                i++;
                // Swap the element 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = piv;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    } 

    public static void main(String[] args) {
        int arr[] = {2,4,5,1,3};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
