class Solution {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 0) 
        return 0;

        Map<Integer, Integer> count = new HashMap<>();
        int maxNum = 0;
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            maxNum = Math.max(maxNum, num);
        }
        int[] points = new int[maxNum + 1];
        for (int num : count.keySet()) {
            points[num] = num * count.get(num);
        }
        int prev2 = 0;
        int prev1 = 0;
        for (int i = 0; i <= maxNum; i++) {
            int curr = Math.max(prev1, prev2 + points[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}