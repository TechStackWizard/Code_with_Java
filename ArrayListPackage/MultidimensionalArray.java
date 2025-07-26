package ArrayListPackage;

import java.util.ArrayList;

public class MultidimensionalArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(8);
        mainList.add(list2);
        
        System.out.println(mainList);
        
    }
}
