class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int pushes = 0;
        for (int i = 1; i <= n; i++) {
            pushes += (i + 7) / 8;
        }
        return pushes;
    }
}
