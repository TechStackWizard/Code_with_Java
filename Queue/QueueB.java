import java.util.Queue;

public class QueueB {
    // implementaion of circular queue
    static class CircularQueue {
        static int arr[];
        static int rear;
        static int size;
        static int front;

        CircularQueue(int n) {
            size = n;
            arr = new int[n];
            rear = -1;
            front = -1;

        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            // System.out.println(front);
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove();
        q.add(5);
        q.remove();
        q.add(6);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}
