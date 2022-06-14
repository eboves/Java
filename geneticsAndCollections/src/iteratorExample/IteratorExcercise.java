package iteratorExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExcercise {
    public static void main(String[] args){
        List<String> names = new LinkedList<String>();
        names.add("Elvis");
        names.add("Karen");
        names.add("Maria");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}