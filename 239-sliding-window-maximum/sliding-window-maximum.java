class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int mind = 0;
        int n = nums.length;
        int[] r = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            while(!dq.isEmpty() && dq.peek() < i-k+1)
                dq.poll();
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();
            dq.offer(i);
            if(i >= k - 1)
                r[i-k+1] = nums[dq.peek()];
        }
        return r;

    }
}