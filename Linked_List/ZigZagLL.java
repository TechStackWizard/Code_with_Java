// package Linked_List;

// import Linked_List.LinkedList;

public class ZigZagLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    void addEnd(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = tail = newnNode;
        } else {
            tail.next = newnNode;
            tail = newnNode;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // find midNode
    public Node midNode() {
        // slow fast approch
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();
        ll.addEnd(1);
        ll.addEnd(2);
        ll.addEnd(3);
        ll.addEnd(4);
        // ll.addEnd(5);

        ll.display();

        // System.out.println(ll.midNode().data);

        // reverse second half of LL
        Node prev = null;
        Node curr = ll.midNode();
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            // System.out.println(prev.data);
        }

        // alternate join the Nodes

    }
}
