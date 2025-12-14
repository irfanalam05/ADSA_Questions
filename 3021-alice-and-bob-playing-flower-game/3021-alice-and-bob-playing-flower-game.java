class Solution {
    public long flowerGame(int n, int m) {
        long oddsX = (n + 1) / 2;
        long evensX = n / 2;
        long oddsY = (m + 1) / 2;
        long evensY = m / 2;
        
        return oddsX * evensY + evensX * oddsY;
    }
}
