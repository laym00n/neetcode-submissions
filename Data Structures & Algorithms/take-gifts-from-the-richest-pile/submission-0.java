
class Solution {
    public long pickGifts(int[] gifts, int k) {
        // 1. Create a Max-Heap to always keep the largest pile at the top
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 2. Add all piles to the heap
        for (int gift : gifts) {
            pq.add(gift);
        }
        
        // 3. Simulate the process k times
        for (int i = 0; i < k; i++) {
            // Get the current largest pile
            int max = pq.poll();
            // Reduce it to the floor of its square root
            int reduced = (int) Math.sqrt(max);
            // Add the new value back to the heap
            pq.add(reduced);
        }
        
        // 4. Calculate the total sum of all remaining piles
        long sum = 0;
        for (int gift : pq) {
            sum += gift;
        }
        
        return sum;
    }
}