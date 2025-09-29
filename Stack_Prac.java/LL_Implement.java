// package Stack_Prac.java;

public class LL_Implement {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        public static Node head;

        boolean isEmpty() {
            return head == null;
        }

        void push(int data) {
            Node newnNode = new Node(data);
            if (head == null) {
                head = newnNode;
            } else {
                newnNode.next = head;
                head = newnNode;
            }
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int ele = head.data;
            head = head.next;
            return ele;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " => ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println(s.pop());
        s.display();
    }
}
