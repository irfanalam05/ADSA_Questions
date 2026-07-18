class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(min>nums[i]){
                min= nums[i];
            }
        }

        for(int i=min; i>= 1;i--){
            if(max % i==0 && min %i==0){
                return i;
            }
        }
        return 1;
    }
}