class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i: nums){
            if(pq.size()>k-1&&i< pq.peek()){continue;}//no point of adding this number
            pq.offer(i);
            if(pq.size()> k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
