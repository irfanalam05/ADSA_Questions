class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int mod = 1_000_000_007;
        int[] dp = new int[n + 1]; // dp[i] = number of people who learn the secret on day i
        dp[1] = 1;
        int sharing = 0;

        for (int day = 2; day <= n; day++) {
            // Add people who can start sharing today
            if (day - delay >= 1) {
                sharing = (sharing + dp[day - delay]) % mod;
            }
            // Remove people who forget today
            if (day - forget >= 1) {
                sharing = (sharing - dp[day - forget] + mod) % mod;
            }
            dp[day] = sharing;
        }

        // Sum people who still remember the secret on day n
        int total = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            total = (total + dp[day]) % mod;
        }

        return total;
    }
}
