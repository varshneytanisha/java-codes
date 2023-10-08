import java.util.ArrayList;
import java.util.Collections;

public class arratList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add a element
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get an element

        int element = list.get(0);
        System.out.println(element);

        // to add element in between
        list.add(1, 1);
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size arraylist
        int size = list.size();
        System.out.println(size);

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // sorting
        Collections.sort(list);
        System.out.println(list);

    }

}
