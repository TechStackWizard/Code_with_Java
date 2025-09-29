package Linked_List;

// public static Node head;

// public static Node tail;

public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    void addMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // void size() {
    // Node temp = head;
    // int i = 0;
    // while (temp != null) {
    // i++;
    // temp = temp.next;
    // }
    // System.out.println("Size of LL is: " + i);
    // }

    int removeFirst() {
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    int removeLast() {
        Node temp = head;
        int val;

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            val = head.data;
            head = tail = null;
            return val;
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            tail = temp;
            val = temp.next.data;
            temp.next = null;
            size--;
            return val;
        }

    }

    int removeMiddle(int idx) {
        Node temp = head;
        int val;
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            val = head.data;
            head = tail = null;
            return val;
        }

        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    int searchEleByIterate(int key) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public static int helper(Node head, int key) {
        // Base Condition
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return idx;
        }

        return idx + 1;
    }

    int searchByRecursive(int key) {
        return helper(head, key);
    }

    void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void deleteNthFromEnd(int n) {

        if (n == size) {
            head = head.next;
            return;
        }

        int preIdx = size - n;
        int i = 1;
        Node temp = head;
        while (i != preIdx) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return;
    }

    public Node findMid() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }

        return slow;
    }

    public boolean checkPolindrome() {
        // Base Case
        if (head == null || head.next == null) {
            return true;
        }

        // find midNode
        Node midNode = findMid();

        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // 2nd half head
        Node left = head;

        // compare 1st half with 2nd half
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);

        ll.addEnd(1);
        ll.addEnd(2);
        ll.addEnd(2);
        ll.addEnd(1);

        // ll.addMiddle(4, 3);

        ll.display();
        // System.out.println(size);

        // ll.removeFirst();
        // ll.display();
        // System.out.println(size);

        // ll.removeLast();
        // ll.display();
        // System.out.println(size);

        // ll.removeMiddle(1);
        // ll.display();

        // ll.display();
        // System.out.println(ll.searchEle(14));
        // System.out.println(ll.searchByRecursive(4));

        // ll.reverse();

        // ll.deleteNthFromEnd(4);
        // ll.display();

        // Node temp = ll.findMid();
        // System.out.println(temp.data);

        // ll : 1->2->2->1
        System.out.println(ll.checkPolindrome());

    }
}
