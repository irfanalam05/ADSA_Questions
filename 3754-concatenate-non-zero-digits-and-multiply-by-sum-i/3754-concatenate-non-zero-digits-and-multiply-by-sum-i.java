class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long rev=0;

        while(n!=0){
            long num= n %10;
            sum+=num;

            if(num !=0){
                rev = rev *10 + num;
            }
            n /= 10;
        }
        long ans=0;
        while(rev!=0){
            ans= ans * 10 + rev % 10;
            rev = rev/10;
        }
        return sum*ans;
        
    }
}