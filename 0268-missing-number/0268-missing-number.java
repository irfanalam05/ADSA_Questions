class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int expsum = (n * (n + 1)) / 2;
        for (int num : nums) {
            sum = sum + num;
        }
        return expsum - sum;
    }
}