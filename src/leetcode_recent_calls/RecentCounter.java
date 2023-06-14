package leetcode_recent_calls;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {
    List<Integer> times;

    public int binarySearch(List<Integer> list, int num) {
        int left = 0, right = list.size();
        int m;

        while (left < right) {
            m = (right + left) / 2;

            if (list.get(m) < num)
                left = m + 1;
            else
                right = m;
        }

        return left;
    }

    public RecentCounter() {
        times = new ArrayList<Integer>();
    }

    public int ping(int t) {
        times.add(t);
        return times.size() - binarySearch(times, t - 3000);
    }
}