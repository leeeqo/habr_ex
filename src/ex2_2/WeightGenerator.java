package ex2_2;

import java.util.Random;

public class WeightGenerator {
    //private final static int SEED = 10;
    private int[] nums;
    private int[] weights;

    public static int WeightGen(int[] nums, int[] weights) {
        int range = sumWeights(weights);

        //int randNum = new Random(SEED).nextInt(range);
        int randNum = new Random().nextInt(range);
        for (int i = 0; i < weights.length; i++) {
            if (randNum >= ((i == 0) ? 0 : weights[i - 1]) && randNum < weights[i]) {
                return nums[i];
            }
        }

        return -1;
    }

    private static int sumWeights(int[] weights) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        return sum;
    }
}
