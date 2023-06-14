package ex7_3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int index = 0;
    MyArrayIterator(List<T> array) {
        this.array = (T[]) array.toArray();
    }

    @Override
    public T next() {
        if(!hasNext()) throw new NoSuchElementException();
        return array[index++];
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }
}
