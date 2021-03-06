class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> count.get(n2) - count.get(n1) );
        
        for (int n : count.keySet()) {
            heap.add(n);
        }
        
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }
        
        return res;
    }
}
