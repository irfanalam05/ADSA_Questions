class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            maxheap.add(s);
        }
        while (maxheap.size() > 1) {
            int y = maxheap.poll(); // heaviest
            int x = maxheap.poll(); // second heaviest

            if (y != x) {
                maxheap.add(y - x);
            }
        }
        return maxheap.isEmpty() ? 0 : maxheap.peek();
        
    }
}