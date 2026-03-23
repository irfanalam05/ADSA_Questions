class Solution {
    public int maxProductPath(int[][] grid) {
        int MOD = 1000000007;
        int n = grid.length, m = grid[0].length;

        long[][] maxDP = new long[n][m];
        long[][] minDP = new long[n][m];

        maxDP[0][0] = minDP[0][0] = grid[0][0];

        for (int j = 1; j < m; j++) {
            maxDP[0][j] = minDP[0][j] = maxDP[0][j-1] * grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            maxDP[i][0] = minDP[i][0] = maxDP[i-1][0] * grid[i][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                long val = grid[i][j];
                long maxFromTop = Math.max(maxDP[i-1][j] * val, minDP[i-1][j] * val);
                long maxFromLeft = Math.max(maxDP[i][j-1] * val, minDP[i][j-1] * val);
                long minFromTop = Math.min(maxDP[i-1][j] * val, minDP[i-1][j] * val);
                long minFromLeft = Math.min(maxDP[i][j-1] * val, minDP[i][j-1] * val);

                maxDP[i][j] = Math.max(maxFromTop, maxFromLeft);
                minDP[i][j] = Math.min(minFromTop, minFromLeft);
            }
        }

        long result = maxDP[n-1][m-1];
        return result < 0 ? -1 : (int)(result % MOD);
    }
}
