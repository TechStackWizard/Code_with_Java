public class QueueA {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add
        public static void add(int data) {
            if (rear == size) {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            return front;
        }

        // peek
        public static int peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

        public static void display() {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        q.display();
    }

}
