package Practice;

public class ArrayP2 {
    // Question 1
    public static boolean appearsTwiceOrNot(int arr[]){
        for(int i=0; i<arr.length; i++){
            int checkNum = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(checkNum == arr[j]) return true;
            }
        }
        return false;
    }


    // Question 2
    public static int getIndexOfTarget(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else{
                if(target > arr[mid]){ //left arr (max value)
                    end = mid-1;
                    start++;
                }else{ //right arr (min value)
                    start = mid+1;
                    end--;
                }
            }
        }
        return -1;
    }


    // Question 5
    public static void returnsTriplet(int arr[]){
        int n = arr.length;
        int arr2D[][] = new int[n/2][3];
        
        int tripletCount = 0;
        int i =0;
        
        for(int j=i+1; j<n-1; j++){
            for(int k=j+1; k<n; k++){
                if(i != j && j != k && k != i){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        arr2D[tripletCount][0] = arr[i];
                        arr2D[tripletCount][1] = arr[j];
                        arr2D[tripletCount][2] = arr[k];
                        tripletCount++;
                    }
                }
            }
        }
        System.out.println(arr2D.length);
        for(int j=0; j<arr2D.length; j++){
            for(int k=0; k<arr2D.length; k++){
                System.out.print(arr2D[j][k]+ " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        // int arr2dSize[][] = new int[arr.length/2][3];
        // int arr2D[][] = {{arr[0], arr[1]},{arr[2], arr[3]}};
        // // System.out.println(appearsTwiceOrNot(arr));
        // // System.out.println(getIndexOfTarget(arr, 3));
        // System.out.println(arr2D.length);
        // System.out.println(arr2dSize.length);
        returnsTriplet(arr);
    }
    
}