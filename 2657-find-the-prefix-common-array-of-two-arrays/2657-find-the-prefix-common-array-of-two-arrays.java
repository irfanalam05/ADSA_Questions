class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];

        boolean[] SA = new boolean[n + 1];
        boolean[] SB = new boolean[n + 1];

        int count = 0;
        for (int i = 0; i < n; i++) {
            SA[A[i]] = true;
            SB[B[i]] = true;

            if (SB[A[i]]) {
                count++;
            }
            if (A[i] != B[i] && SA[B[i]]) {
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}