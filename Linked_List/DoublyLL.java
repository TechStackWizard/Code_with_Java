package Linked_List;

class Node {
    Node prev;
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLL {

    public static Node head;
    public static Node tail;
    public static int size;

    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        System.out.println(tail.data);
    }

    int removeFirst() {
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void removeLast() {
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(30);
        dll.addFirst(20);
        dll.addFirst(10);

        dll.display();
        // System.out.println(dll.removeFirst());

        // dll.display();

        dll.addLast(40);
        dll.display();
        dll.removeLast();
        dll.display();
    }

}
