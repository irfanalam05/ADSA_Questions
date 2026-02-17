class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int left = 0;
        for (int i = 0; i < n; i++) {
            int right = total - left - nums[i];
            if (left == right) {
                return i;  // pivot index mil gaya
            }
            left += nums[i];
        }

        return -1; // agar pivot index na mile
    }
}
