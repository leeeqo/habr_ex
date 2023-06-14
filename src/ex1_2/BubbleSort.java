package ex1_2;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
            System.out.printf("%.2f, ", array[i]);
        }


        bubbleSort(array);
        System.out.println("");
        for (int i = 0; i < n; i++) {
            //array[i] = Math.random();
            System.out.printf("%.2f, ", array[i]);
        }
    }

    public static void bubbleSort(double[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[i]) {
                    double temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
