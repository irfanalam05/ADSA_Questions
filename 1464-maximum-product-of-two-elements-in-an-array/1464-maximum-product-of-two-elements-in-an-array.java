class Solution {
    public int maxProduct(int[] nums) {
        int sec=0;
        int fir=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if (nums[i]>=fir){
                sec=fir;
                fir=nums[i];
            } else if(nums[i]> sec){
                sec= nums[i];
            }
        }
        int res= (fir-1)*(sec-1);
        return res;
    }
}