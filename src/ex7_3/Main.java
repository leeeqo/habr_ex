package ex7_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hi!");
        list.add("My");
        list.add("name is");
        list.add("Alex");

        Iterator<String> iter = new MyArrayIterator<String>(list);
        while (iter.hasNext()) {
            System.out.printf("%s ", iter.next());
        }
    }
}
