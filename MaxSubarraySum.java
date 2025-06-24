public class MaxSubarraySum {

    // Method 1 : (Brute Force) It takes O(n^3) timeComplexity i.e very worst 
    public static void MaxSubArrays_Sum(int numbers[]){
        int n = numbers.length;
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int last = j;
                currSum = 0;
                for(int k=start; k<=last; k++){
                    System.out.print(numbers[k]+ " ");
                    currSum += numbers[k];
                }
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Maximum Sum is = "+ maxSum);
    }

    // Method 2 : (Prefix Sum) It's timeComplexity is O(n^2);
    public static void MaxSumofSubArray(int numbers[]){
        int n = numbers.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = numbers[0];
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int start = i;
            int currSum = 0;
            for(int j=i; j<n; j++){
                int end = j;
                currSum = start==0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];
            }
            if(maxSum < currSum){
                maxSum = currSum;
            }
      }
      System.out.println("Maximum Sum is : "+maxSum);
    }
    // Method 3 : (Kadane's Algorithem) It's timeComplexity is O(n);
    // It is the best method for finding max sum of subarrays;
    public static void Kadanes(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            currSum += numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            if(currSum >= maxSum){
                maxSum = currSum;
            } 
        }
        System.out.println("Maximum sum is : "+ maxSum);
    }

    public static void main(String[] args) {
        // int numbers[] = {1,-1,6,2,1};
        int numbers[] = {2,4,-1,-4,-8};
        MaxSubArrays_Sum(numbers); 
        MaxSumofSubArray(numbers);
        Kadanes(numbers);
    }
}
