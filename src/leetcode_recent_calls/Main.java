package leetcode_recent_calls;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        List<Integer> nums = new ArrayList<>();
        //int[] times = {1, 100, 3000, 3001, 3002};
        int[] times = {642, 1849, 4921, 5936, 5957};
        for (int i = 0; i < times.length; i++) {
            System.out.println("Iteration: " + i);
            nums.add(obj.ping(times[i]));
        }

        System.out.println(nums.toString());
    }
}
