class Solution {
    public int[] beautifulArray(int n) {
        java.util.List<Integer> res = new java.util.ArrayList<>();
        res.add(1);

        while (res.size() < n) {
            java.util.List<Integer> temp = new java.util.ArrayList<>();
            for (int x : res) {
                if (2 * x - 1 <= n) temp.add(2 * x - 1);
            }
            for (int x : res) {
                if (2 * x <= n) temp.add(2 * x);
            }
            res = temp;
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = res.get(i);
        return ans;
    }
}
