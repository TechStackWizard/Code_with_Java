package Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSort_LL {

    public static Node head;
    public static Node tail;

    void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    void mergeSort() {

    }

    void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSort_LL ll = new MergeSort_LL();

        ll.addEnd(10);
        ll.addEnd(20);
        ll.addEnd(30);

        ll.printLL();
    }

}
