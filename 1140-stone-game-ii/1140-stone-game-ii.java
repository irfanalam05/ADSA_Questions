class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffix = new int[n+1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i+1] + piles[i];
        }
        
        Integer[][] dp = new Integer[n][n+1];
        
        return stone(piles, suffix, 0, 1, dp);
    }
    
    private int stone(int[] piles, int[] suffix, int i, int m, Integer[][] dp) {
        int n = piles.length;
        if (i >= n) return 0;
        if (i + 2*m >= n) return suffix[i];
        
        if (dp[i][m] != null) return dp[i][m];
        
        int res = 0;
        for (int x = 1; x <= 2*m; x++) {
            res = Math.max(res, suffix[i] - stone(piles, suffix, i+x, Math.max(m, x), dp));
        }
        
        return dp[i][m] = res;
    }
}
