class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0 ; i<nums.length ;i++){
            pq.add(nums[i]);
        }
        while(!pq.isEmpty()){
            int curr = pq.remove();
            if(k == 1){
                return curr;
            }
            k--;
        }
        return -1;
    }

}