class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            prefix = prefix * nums[i];
            if (suffix == 0) {
                suffix = 1;
            }
            suffix = suffix * nums[n - 1 - i];

            if (prefix > max) {
                max = prefix;
            }
            if (suffix > max) {
                max = suffix;
            }
        }

        return max;
    }
}
