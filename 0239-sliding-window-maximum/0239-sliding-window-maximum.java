class Solution {
    class pair implements Comparable<pair>{
        int val;
        int idx;

        public pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(pair other){
            return other.val - this.val;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];
        // Deque<Integer> dq = new ArrayDeque<>();
        // int indx = 0;
        // for(int i=0 ; i<n ; i++){
        //     while(!dq.isEmpty() && dq.peekFirst() <= i-k){
        //         dq.pollFirst();
        //     }

        //     while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
        //         dq.pollLast();
        //     }

        //     dq.offerLast(i);

        //     if(i >= k-1){
        //         ans[indx++] = nums[dq.peekFirst()];
        //     }
        // }
        PriorityQueue<pair>pq = new PriorityQueue<>();
        for(int i=0 ; i<k ; i++){
            pq.add(new pair(nums[i],i));
        }
        int j = 0;
        ans[j++] =pq.peek().val;

        for(int i=k; i<n ; i++){
            while(pq.size()>0 && pq.peek().idx <=(i-k)){
                pq.poll();
            }
            pq.add(new pair(nums[i],i));
            ans[j++] =pq.peek().val;
        }
        return ans;
    }
}