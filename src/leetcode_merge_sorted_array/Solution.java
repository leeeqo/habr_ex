package leetcode_merge_sorted_array;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1;

        if (ptr1 < 0) {
            if (ptr2 < 0)
                return;
            else {
                while (ptr2 > -1) {
                    nums1[ptr2] = nums2[ptr2];
                    ptr2--;
                }
            }
        }
        if (ptr2 < 0)
            return;

        int currInsrtIdx = nums1.length - 1;
        while (true) {
            if (nums1[ptr1] > nums2[ptr2]) {
                nums1[currInsrtIdx] = nums1[ptr1];
                ptr1--;
            }
            else {
                nums1[currInsrtIdx] = nums2[ptr2];
                ptr2--;
            }
            currInsrtIdx--;

            if (ptr2 < 0)
                break;
            if (ptr1 < 0) {
                while (currInsrtIdx > -1) {
                    nums1[currInsrtIdx] = nums2[ptr2];
                    currInsrtIdx--;
                    ptr2--;
                }
                break;
            }
        }
    }
}
