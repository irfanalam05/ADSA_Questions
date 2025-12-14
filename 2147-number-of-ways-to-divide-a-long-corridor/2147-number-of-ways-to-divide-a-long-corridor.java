class Solution {
    public int numberOfWays(String corridor) {
        final int MOD = 1_000_000_007;

        int seats = 0;
        for (char c : corridor.toCharArray()) {
            if (c == 'S') seats++;
        }

        if (seats == 0 || seats % 2 != 0) 
        return 0;

        long ways = 1;
        int Count = 0;
        int plantsbtw = 0;

        for (char c : corridor.toCharArray()) {
            if (c == 'S') {
                Count++;
                if (Count > 2 && Count % 2 == 1) {
                    ways = (ways * (plantsbtw + 1)) % MOD;
                    plantsbtw = 0;
                }
            } else {
                if (Count >= 2 && Count % 2 == 0) {
                    plantsbtw++;
                }
            }
        }
        return (int) ways;
    }
}
