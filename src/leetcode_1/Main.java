package leetcode_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(1))));
        Solution solution = new Solution();
        System.out.println(solution.getDecimalValue(l1));
    }
}
