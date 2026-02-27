class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long n = nums.length;
        if(n<k){
            return -1;
        }
        long wsum=0;
        for(int i=0; i<k;i++){
            wsum +=nums[i];
        }
        long msum=wsum;
        
        
        for(int i=k; i<n ;i++){
            wsum+= nums[i] -nums[i-k];
            msum= Math.max(msum, wsum);
        }
        return (double) msum /k;  
    }
}