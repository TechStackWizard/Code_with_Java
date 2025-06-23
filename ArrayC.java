import java.util.*;

public class ArrayC {

    public static void updateValue(int mark[], int nonChangeble, String name) {
        nonChangeble = 15;
        name = "Anshu";
        for (int i = 0; i < mark.length; i++) {
            mark[i] += 1;
        }
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        System.out.println(largest);
        for (int i = 0; i < numbers.length; i++) {
            // largest = Math.max(largest,numbers[i]);
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int BinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] > key) { // 1st half (right array)
                end = mid - 1;
            } else { // 2nd half (left array)
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void ReverseArray(int numbers[]){
        int n = numbers.length-1;
        for(int i=0; i<=n; i++){
            int first = i;
            int last = n-i;
            if(first < last){
                int temp = numbers[first];
                numbers[first] = numbers[last];
                numbers[last] = temp;
            }
        } 
    }

    public static void ArrayPair(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.print("(" + numbers[i] + ","+ numbers[j]+ ") ");
            }
            System.out.println();
        }
    }

    public static void SubArrays(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int last = j;
                int sum = 0;
                for(int k=start; k<=last; k++){
                    System.out.print(numbers[k]+ " " );
                    sum += numbers[k];
                }
                System.out.print("Sum = "+ sum);
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // int nonChangeble = 10;
        // String str = "Anshul";
        // int marks[] = {94, 94, 72};
        // updateValue(marks, nonChangeble, str);
        // for(int i=0; i<marks.length; i++){
        // System.out.println(marks[i]);
        // }
        // System.out.println(nonChangeble + " "+ str);

        // int marks[] = new int[10];
        // Scanner sc = new Scanner(System.in);
        // int math = sc.nextInt();
        // int physics = sc.nextInt();
        // int chemistry = sc.nextInt();
        // marks[0] = math;
        // marks[1] = physics;
        // marks[2] = chemistry;
        // System.out.println("Marks of Math :"+ marks[0]+"\nMarks of Physics :"+
        // marks[1] + "\nMarks of Math :"+ marks[2]);
        // System.out.println(marks.length);

        // int numbers[] = {4,2,12,5,6,3,7};
        // int key = 14;
        // int idx = linearSearch(numbers, key);
        // if(idx == -1){
        // System.out.println(key + " is not exist in array...");
        // } else{
        // System.out.println(key + " is exist at index "+idx);
        // }

        // System.out.println("Largest Number is : "+largestNumber(numbers));

        // int numbers[] = { 2, 4, 5, 7, 8, 12, 14 };
        // int key = 7;
        // int idx = BinarySearch(numbers, key);
        // if (idx == -1) {
        //     System.out.println(key + " is not exist in array...");
        // } else {
        //     System.out.println(key + " is exist at index " + idx);
        // }


        int numbers[] = {2,3,10,12};
        // ReverseArray(numbers);
        // System.out.print("Reversed Array elements is : ");
        // for(int i=0; i<=numbers.length-1; i++){
        //     System.out.print(numbers[i] + " ");
        // }
        // ArrayPair(numbers);

        SubArrays(numbers);


    }
}
