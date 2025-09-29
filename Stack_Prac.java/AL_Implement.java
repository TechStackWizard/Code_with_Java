import java.util.ArrayList;
import java.util.Stack;

public class AL_Implement {

    // Implementation using ArrayList datastructure
    static class Stack {
        ArrayList<Integer> arr = new ArrayList<>();

        boolean isEmpty() {
            return arr.isEmpty();
        }

        void push(int data) {
            arr.add(data);
        }

        int pop() {
            int ele = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            return ele;
        }

        int peek() {
            int ele = arr.get(arr.size() - 1);
            return ele;
        }

        void display() {
            for (int i = arr.size() - 1; i >= 0; i--) {
                System.out.println(arr.get(i));
            }
        }

    }

    // Implementation using ArrayList datastructure

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        // System.out.println(s.isEmpty());
        // System.out.println(s.peek());
        // System.out.println("Popped element is : " + s.pop());

    }
}