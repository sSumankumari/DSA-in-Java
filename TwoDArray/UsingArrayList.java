package TwoDArray;

import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        System.out.println(list);

        // contains() uses linear search to find the target
        System.out.println(list.contains(5));
        System.out.println(list.get(3));

        list.add(2, 10);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, 7));

        System.out.println(Collections.binarySearch(list, 2));
        System.out.println(Collections.binarySearch(list, 6));
        System.out.println(Collections.binarySearch(list, 11));
    }
}
