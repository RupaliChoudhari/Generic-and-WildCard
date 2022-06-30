import com.custom.arraylist.MyCustomArrayList;
import com.custom.genericlist.GenericArrayList;
import com.custom.genericwildlist.GenericWildCardArrayList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyCustomArrayList list = new MyCustomArrayList();
        GenericArrayList generic_list = new GenericArrayList();
        GenericWildCardArrayList generic_wildcard_list = new GenericWildCardArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        generic_list.add("Rupali");
        generic_list.add("Radhika");
        generic_list.add("Sheetal");


        // This list can only contain Number or Numbers child
        generic_wildcard_list.add(2.4);
        generic_wildcard_list.add(5);

        System.out.println(list);
        System.out.println(generic_list);
        System.out.println(generic_wildcard_list);

    }
}