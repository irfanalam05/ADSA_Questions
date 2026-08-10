class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] sq = new boolean[n + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k * k <= i; k++) {
                if (!sq[i - k * k]) {
                    sq[i] = true;
                    break;
                }
            }
        }    
        return sq [n];
    }
}
