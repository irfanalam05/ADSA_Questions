class Solution {
    public int largestAltitude(int[] gain) {
     int sum=0;
     int maxS=0;

     for (int i=0; i< gain.length;i++){
        sum=sum+ gain[i];
        if(maxS< sum){
            maxS=sum;
        }
     }
     return maxS;   
    }
}