package leetcode_1;

public class Solution {
    int res;

    public int reverse(int n)
    {
        int rev = 0;
        while (n > 0) {
            rev <<= 1;
            if ((int)(n & 1) == 1) {
                rev ^= 1;
            }
            n >>= 1;
        }
        return rev;
    }

    public int getDecimalValue(ListNode head) {
        int res = 0;
        int idx = 0;
        ListNode curr = head;
        while (true) {
            res += Math.pow(2, idx) * curr.val;
            System.out.println("Curr res = " + res);
            idx++;
            if (curr.next != null) {
                curr = curr.next;
            }
            else {
                break;
            }
        }
        System.out.println("Result num = " + res);
        return reverse(res);
    }
}
