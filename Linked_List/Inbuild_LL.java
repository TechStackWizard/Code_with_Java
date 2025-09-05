package Linked_List;

import java.util.LinkedList;

public class Inbuild_LL {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);

        // ll.removeLast();
        ll.addFirst(12);
        ll.addFirst(10);
        System.out.println(ll);

    }
}
