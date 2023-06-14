package leetcode_merge_sorted_array;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {5, 0};
        int[] nums2 = {1};
        int m = 1, n = 1;

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);

        System.out.printf("[");
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d,", nums1[i]);
        }
        System.out.printf("]");
    }
}
