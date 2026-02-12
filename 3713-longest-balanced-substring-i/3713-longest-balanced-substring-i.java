class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int max_len = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int distinct = 0;
            int max_freq = 0;

            for (int j = i; j < n; j++) {
                int k = s.charAt(j) - 'a';

                if (freq[k] == 0) {
                    distinct++;
                }

                freq[k]++;
                max_freq = Math.max(max_freq, freq[k]);

                int length = j - i + 1;

                if (length == distinct * max_freq) {
                    max_len = Math.max(max_len, length);
                }
            }
        }
        return max_len;
    }
}
