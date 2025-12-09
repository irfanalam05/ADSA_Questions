class Solution {
    public int specialTriplets(int[] nums) {
        long MOD = 1_000_000_007L;

        java.util.HashMap<Integer, Long> valid_i = new java.util.HashMap<>();
        java.util.HashMap<Integer, Long> valid_j = new java.util.HashMap<>();

        long result = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                long add = 0;
                if (valid_j.containsKey(num / 2)) {
                    add = valid_j.get(num / 2);
                }
                result = (result + add) % MOD;
            }

            long val = 0;
            if (valid_i.containsKey(2 * num)) {
                val = valid_i.get(2 * num);
            }

            if (valid_j.containsKey(num)) {
                valid_j.put(num, (valid_j.get(num) + val) % MOD);
            } else {
                valid_j.put(num, val % MOD);
            }

            if (valid_i.containsKey(num)) {
                valid_i.put(num, valid_i.get(num) + 1);
            } else {
                valid_i.put(num, 1L);
            }
        }

        return (int) result;
    }
}
