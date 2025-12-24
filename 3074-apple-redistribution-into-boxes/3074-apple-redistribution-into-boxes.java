class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0; i<= apple.length-1;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i= capacity.length - 1; i >= 0 && sum > 0; i--){
            sum = sum - capacity[i];
            count++;
        }
        return count;
    }
}