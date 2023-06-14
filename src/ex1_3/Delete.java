package ex1_3;

import java.util.Arrays;
import java.util.Random;

public class Delete {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        Random generator = new Random(10);
        for (int i = 0; i < n; i++) {
            array[i] = generator.nextInt(10); //(int) (Math.random() * 100);
            System.out.printf("%d, ", array[i]);
        }

        int toDel = 3;

        int[] newArray = delete(array, toDel);

        System.out.println("After deletion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("%d, ", newArray[i]);
        }
    }

    public static int[] delete(int[] array, int toDel) {
        int step = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toDel) {
                step++;
            }
            else {
                array[i - step] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - step);
    }
}
