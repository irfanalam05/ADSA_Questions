class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        // last exclude
        int case1 = rob(nums, 0, nums.length - 2);
        // first exclude
        int case2 = rob(nums, 1, nums.length - 1);

         return Math.max(case1, case2);
        
    }
    private int rob(int[] nums, int start, int end) {
        int prev2 = 0; 
        int prev1 = 0;

        for(int i=start ; i<=end; i++){
            int curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;   
    }
}