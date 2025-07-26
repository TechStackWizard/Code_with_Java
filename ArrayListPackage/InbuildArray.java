package ArrayListPackage;

import java.util.ArrayList;
import java.util.Collections;

public class InbuildArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(8);

        int ele = list.get(3);
        System.out.println(ele);

        list.set(2, 10);
        System.out.println(list);
        
        list.remove(1);
        System.out.println(list);
        
        // Special 'add' method property
        list.add(1, 4);
        System.out.println(list);
        
        // Sort an array using inbuilt method
        Collections.sort(list);
        System.out.println(list);
        
    }
}
