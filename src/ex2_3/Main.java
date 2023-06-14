package ex2_3;

public class Main {
    public static void main(String[] args) {
        MyList<int[]> tryList = new MyList<>();

        tryList.pushBack(new int[]{1, 3});
        tryList.pushBack(new int[]{5, 6});

        tryList.popFront();
        tryList.clear();
    }
}
