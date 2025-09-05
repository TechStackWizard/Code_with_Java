public class QuizPractice {
    public static void printOccurance(int arr[], int key) {
        int st = 0, lst = arr.length - 1;
        boolean first = false, last = false;

        while (st != arr.length - 1 && lst != 0) {
            if (arr[st] == key && !first) {
                first = true;
                System.out.println("Fist occured at index : " + st);

            }
            if (arr[lst] == key && !last) {
                last = true;
                System.out.println("Last occured at index : " + lst);
            }
            st++;
            lst--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 1, 2, 1, 2, 3, 4 };
        printOccurance(arr, 4);
    }
}
