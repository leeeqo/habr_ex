package ex7_1;

import java.util.Collection;
import java.util.HashSet;

public class RemoveDublicates {
    public static <T> Collection<T> removeDublicates(Collection<T> collection) {
        //Set<T> set = new HashSet<>();
        //set.addAll(collection);
        //return (Collection<T>) set;
        return new HashSet<>(collection);
    }
}
