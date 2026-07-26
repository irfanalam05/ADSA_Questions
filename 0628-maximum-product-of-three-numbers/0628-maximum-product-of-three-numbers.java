class Solution {
    public int maximumProduct(int[] nums) {
       int fir=Integer.MIN_VALUE;
       int sec=Integer.MIN_VALUE;
       int trd=Integer.MIN_VALUE;

       int min1=Integer.MAX_VALUE;
       int min2=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>=fir){
            trd=sec;
            sec=fir;
            fir=nums[i];
        }else if(nums[i]>sec){
            trd=sec;
            sec=nums[i];
        }else if(nums[i]>trd){
            trd=nums[i];
        }


        if(nums[i]<=min1){
            min2=min1;
            min1=nums[i];
        }else if(nums[i]< min2){
            min2=nums[i];
        }
       }
       return Math.max( fir*sec*trd, fir*min1*min2); 
    }
}