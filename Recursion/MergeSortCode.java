
public class MergeSortCode {
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int l = si;
        int r = mid + 1;
        int k = 0;
    
        while(l <= mid && r <= ei){
            if(arr[l] > arr[r]){
                temp[k] = arr[r];
                k++; r++;
            }else {
                temp[k] = arr[l];
                k++; l++;
            }
        }
    
        while(l <= mid){
            temp[k++] = arr[l++];
        }
        while(r <= ei){
            temp[k++] = arr[r++];
        }
    
        // Coping to an original array
        for(k=0, l=si; k<temp.length; k++){
            arr[l] = temp[k];
            l++;
        }
    }

    public static void mergeSort(int arr[], int si,int ei){
        if(si >= ei) return;

        int mid = si + (ei- si)/2;
        mergeSort(arr, si, mid); //Left 
        mergeSort(arr, mid+1, ei); //Right
        merge(arr, si,mid, ei); //Merging Array

    }


    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    } 

    public static void main(String[] args) {
        int arr[] = {12,10,2,15};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
