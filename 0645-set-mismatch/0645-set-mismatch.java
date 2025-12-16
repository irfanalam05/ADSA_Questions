class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int duplicate = -1;

        for(int x : nums){
            if(!set.add(x)){
                duplicate = x;
            }
        }
       
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int[] {duplicate,missing};
        
    }
}