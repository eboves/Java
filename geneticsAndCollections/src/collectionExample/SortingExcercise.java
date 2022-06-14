package collectionExample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingExcercise {
    public static void main(String[] args){
        List<String> names = new LinkedList<String>();
        names.add("Elvis");
        names.add("Boves");
        names.add("Colon");

        Collections.sort(names);
        for (String name: names) {
            System.out.println(name);
        }
    }
}
