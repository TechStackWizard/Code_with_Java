public class Practice {
    // Question 1
    public static void printIndexOfEle(int arr[], int i, int key){
        if(i == arr.length) return;
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        printIndexOfEle(arr, i+1, key);
    }

    // Question 2
    public static String getWord(int i){
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six",
        "seven", "eight", "nine"};
        return arr[i];
    } 

    public static void convertedToString(Integer num){
        String str = Integer.toString(num);
        useRecursion(str, 0);
    }

    static void useRecursion(String str, int i){
        if(i >= str.length()){
            return;
        }
        System.out.print(getWord(i) + " ");
        useRecursion(str, i+1);
    }

    // Question 3
    public static void getLength(String str){
        int count = 0;
        try {
            while(true){
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Length of str is : " + count);
        }
    }

    // Question 4
    public static void printSubArrayCount(String str){
        int count=0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(i == j || str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("Count is :" + count);
    }



    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // printIndexOfEle(arr, 0, 2);
        // convertedToString(1947);
        // getLength("Hello");
        printSubArrayCount("abcab");
    }
}
