package ex7_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void fillArrayList(ArrayList<Double> arrayList) {
        Random rand = new Random(37);
        for (int i = 0; i < 10E+6; i++) {
            arrayList.add(rand.nextDouble());
        }
    }

    public static void fillLinkedList(LinkedList<Double> linkedList) {
        Random rand = new Random(37);
        for (int i = 0; i < 10E+6; i++) {
            linkedList.add(rand.nextDouble());
        }
    }

    public static void getElem(ArrayList<Double> arrayList) {
        Random rand = new Random(10);
        for (int i = 0; i < 10E+4; i++) {
            arrayList.get(rand.nextInt(999999));
        }
    }

    public static void getElem(LinkedList<Double> linkedList) {
        Random rand = new Random(10);
        for (int i = 0; i < 10E+4; i++) {
            linkedList.get(rand.nextInt(999999));
            //System.out.println("Iter " + i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();

        long startArr = System.currentTimeMillis();
        fillArrayList(arrayList);
        long endArr = System.currentTimeMillis();

        System.out.println("ArrayList:");
        System.out.printf("add: \t time = %d \n", endArr - startArr);

        startArr = System.currentTimeMillis();
        getElem(arrayList);
        endArr = System.currentTimeMillis();

        System.out.printf("get: \t time = %d \n", endArr - startArr);


        LinkedList<Double> linkedList = new LinkedList<>();

        long startLink = System.currentTimeMillis();
        fillLinkedList(linkedList);
        long endLink = System.currentTimeMillis();

        System.out.println("LinkedList");
        System.out.printf("add: \t time = %d", endLink - startLink);

        startLink = System.currentTimeMillis();
        getElem(linkedList);
        endLink = System.currentTimeMillis();

        System.out.printf("get: \t time = %d \n", endLink - startLink);

    }
}
