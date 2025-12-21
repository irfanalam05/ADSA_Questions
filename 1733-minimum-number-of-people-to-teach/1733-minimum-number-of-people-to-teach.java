import java.util.*;

class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        // Convert each userS known languages to a set for quick lookup
        List<Set<Integer>> userLanguages = new ArrayList<>();
        for (int[] lang : languages) {
            Set<Integer> set = new HashSet<>();
            for (int l : lang) set.add(l);
            userLanguages.add(set);
        }

        // Identify all friendships where users cannot communicate
        Set<Integer> toTeach = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0] - 1, v = f[1] - 1;
            Set<Integer> common = new HashSet<>(userLanguages.get(u));
            common.retainAll(userLanguages.get(v));
            if (common.isEmpty()) {
                toTeach.add(u);
                toTeach.add(v);
            }
        }

        //  Teaching each language and count how many users need learn it
        int minTeach = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int user : toTeach) {
                if (!userLanguages.get(user).contains(i)) count++;
            }
            minTeach = Math.min(minTeach, count);
        }

        return minTeach;
    }
}
