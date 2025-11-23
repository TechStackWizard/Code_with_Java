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

    // optimized solution for next greater element with time complexity O(n)
    public static void nextGreaterOptimize(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] <= curr) {
                stack.pop();
            }
            nextGreater[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }

    public static void stockSpan(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int span[] = new int[arr.length];
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < arr.length; i++) {
            int currPrice = arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] <= currPrice) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i == arr.length - 1 ? i + 1 : 1;

            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
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

        // int arr[] = { 6, 8, 0, 1, 3 };
        // greaterAtRight(arr);
        // nextGreaterOptimize(arr);

        int arr[] = { 100, 80, 60, 70, 60, 85, 20 };
        stockSpan(arr);
    }
}
