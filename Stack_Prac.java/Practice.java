import java.util.Stack;

public class Practice {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    // Reverse a String using stack
    public static StringBuilder revereString(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (str.length() != i) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result;
    }

    // Reverse a stack
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int data = s.pop();
        reverseStack(s);
        pushAtBottom(s, data);
    }

    // Next Greater Element in an array is as first greater that is right of that
    // elemen
    public static void greaterAtRight(int arr[]) { // Time Complexity : O(n^2)
        for (int i = 0; i < arr.length; i++) {
            boolean isFound = false;
            int j = i + 1;
            while (!isFound && j < arr.length) {
                if (arr[i] < arr[j]) {
                    isFound = true;
                    arr[i] = arr[j];
                }
                j++;
            }
            if (!isFound)
                arr[i] = -1;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtBottom(s, 5);
        // printStack(s);

        // System.out.println(revereString("loop"));

        // 1->2->3
        // reverseStack(s);
        // printStack(s); // 3->2->1

        int arr[] = { 6, 8, 0, 1, 3 };
        greaterAtRight(arr);
    }
}
