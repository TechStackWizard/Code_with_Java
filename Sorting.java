import java.util.*;

public class Sorting {

    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<=n-2; i++){
            for(int j=0; j<=n-2-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minPos = i;
            for(int j=i+1; j<n; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && curr < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void countSort(int arr[]){
        int n = arr.length;
        int maxEle = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxEle = Math.max(maxEle, arr[i]);
        }

        int count[] = new int[maxEle+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
    }


    public static void main(String[] args) {
        // int arr[] = {4,2,1,5,3}; 
        // bubbleSort(arr);       
        // selectionSort(arr);       
        // insertionSort(arr);
        
        // Arrays.sort(arr, 0,3);
        // for(int i=0; i<arr.length; i++){
            //     System.out.print(arr[i]+" ");
            // }
            
        // Integer arr[] = {4,2,1,5,3};  //We use reverse sort array functionality only on objects so, i create Integer object of array.
        // Arrays.sort(arr,2, arr.length , Collections.reverseOrder());
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        
        int arr[] = {1,2,3,1,2,3,4,6};
        countSort(arr);  
    }
}
