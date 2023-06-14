package ex1_1;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
            //System.out.println(array[i]);
        }

        double minNum = Double.POSITIVE_INFINITY;
        double maxNum = Double.NEGATIVE_INFINITY;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
            sum += array[i];
        }

        System.out.printf("Max = %.2f, Min = %.2f \n", maxNum, minNum);
        System.out.printf("Average = %.2f", sum / array.length);
    }
}
