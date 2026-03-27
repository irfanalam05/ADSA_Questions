class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int shift = k % n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ex;
                if (i % 2 == 0) {
                    ex = mat[i][(j + shift) % n];
                } else {
                    ex = mat[i][(j - shift + n) % n];
                }
                if (mat[i][j] != ex) {
                    return false;
                }
            }
        }
        return true;
    }
}