package ex2_3;

public class MyList<T> {
    private static class Node<T> {
        MyList.Node<T> pNext;
        MyList.Node<T> pPrev;
        T data;

        public Node(T data) {
            this.pNext = null;
            this.pPrev = null;
            this.data = data;
        }

        public Node(T data, MyList.Node<T> pPrev) {
            this.pNext = null;
            this.pPrev = pPrev;
            this.data = data;
        }

        public Node(T data, MyList.Node<T> pNext, MyList.Node<T> pPrev) {
            this.pNext = pNext;
            this.pPrev = pPrev;
            this.data = data;
        }
    }

    private int size;
    private MyList.Node<T> head;
    private MyList.Node<T> tail;

    public MyList() {
        size = 0;
        head = null;
        tail = null;
    }

    public MyList(MyList<T> other) {
        this.size = other.size;
        //this.head = (other.head.data instanceof T) ? other.head.data : null;
        this.head = new MyList.Node<T>(other.head.data);

        MyList.Node<T> curr = this.head;
        MyList.Node<T> otherCurr = other.head;

        while (otherCurr.pNext != null) {
            otherCurr = otherCurr.pNext;
            curr.pNext = new MyList.Node<T>(otherCurr.data, curr);
            curr = curr.pNext;
        }

        curr.pNext = null;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        MyList.Node<T> temp = head;
        head = tail;
        tail = temp;
    }

    public void pushFront(T newData) {
        if (head == null) { head = tail = new MyList.Node<T>(newData, null, null); }
        else { head = head.pPrev = new MyList.Node<T>(newData, head, null); }
        size++;
    }

    public void pushBack(T newData) {
        if (head == null) { head = tail = new MyList.Node<T>(newData, null, null); }
        else { tail = tail.pNext = new MyList.Node<T>(newData, null, tail); }
        size++;
    }

    public void clear() {
        while (size > 0) {
            popFront();
        }
    }

    public void popFront() {
        if (head.pNext != null) {
            MyList.Node<T> temp = head;
            head.pNext.pPrev = null;
            head = head.pNext;
            temp = null;
        }
        else {
            head = tail = null;
        }
        size--;
    }

    public void popBack() {
        if (tail.pPrev != null) {
            MyList.Node<T> temp = tail;
            tail.pPrev.pNext = null;
            tail = tail.pPrev;
            temp = null;
        }
        else {
            head = tail = null;
        }
        size--;
    }

    public T getElem(int index){
        if (index < 0 || index > size - 1) { return null; }
        if (head == null) { return null; }
        else {
            int counter = 0;
            if (index <= size / 2) {
                MyList.Node<T> curr = head;
                while (true) {
                    if (counter == index) { return curr.data; }
                    curr = curr.pNext;
                    counter++;
                }
            }
            else {
                counter = size - 1;
                MyList.Node<T> curr = tail;
                while (true) {
                    if (counter == index) { return curr.data; }
                    curr = curr.pPrev;
                    counter--;
                }
            }
        }
    }
}
