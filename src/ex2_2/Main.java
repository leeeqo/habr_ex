package ex2_2;

public class Main {
    public static void main(String[] args) {
        int numExperiments = 1300;
        int[] nums = {1, 2, 3};
        int[] weights = {1, 2, 10};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < numExperiments; i++) {
            int currNum = WeightGenerator.WeightGen(nums, weights);
            switch (currNum) {
                case 1 : { sum1++; }
                case 2 : { sum2++; }
                case 3 : { sum3++; }
            }
        }

        System.out.println("Results: ");
        System.out.printf("Freq 1 = %d, Freq 2 = %d, Freq 3 = %d", sum1, sum2, sum3);
    }
}
