package DivideAndConquer;

public class MergeSortClass {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        // Base Case
        if (start >= end) {
            return;
        }

        // Divide and Conquer
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid); //Left part
        mergeSort(arr, mid + 1, end); //Right part
        merge(arr, start, mid, end);

    }

    public static void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end-start +1];
        int left = start; //Iterator for left part
        int right = mid + 1; //Iterator for right part
        int k = 0; //Interator for temp Array


        while(left <= mid && right <= end){
            if(arr[left] > arr[right]){
                temp[k] = arr[right];
                right++;
            }
            else{
                temp[k] = arr[left];
                left++;
            }
            k++;
        }
        // for left elemnts
        while(left <= mid){
            temp[k++] = arr[left++];
        }

        // for right elements
        while(right <= end){
            temp[k++] = arr[right++];
        }

        // copy temp to original arr;
        for(k=0, left=start; k<temp.length; k++,left++){
            arr[left] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 5, 8, 1, 4 };
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
