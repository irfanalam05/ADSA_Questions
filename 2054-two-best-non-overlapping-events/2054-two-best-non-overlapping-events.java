class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        int n = events.length;

        int[] suffixMax = new int[n];
        suffixMax[n - 1] = events[n - 1][2];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], events[i][2]);
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int start = events[i][0];
            int end = events[i][1];
            int value = events[i][2];

            answer = Math.max(answer, value);

            int nextIndex = binarySearch(events, end + 1);
            if (nextIndex < n) {
                answer = Math.max(answer, value + suffixMax[nextIndex]);
            }
        }

        return answer;
    }

    private int binarySearch(int[][] events, int target) {
        int left = 0, right = events.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (events[mid][0] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
