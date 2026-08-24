class Solution {
    class info{
        int p1;
        int p2;
        int sum;

        public info(int p1,int p2,int sum){
            this.p1 = p1;
            this.p2 = p2;
            this.sum = sum;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<info>pq = new PriorityQueue<>((a,b) -> a.sum-b.sum);
        List<List<Integer>>ans = new ArrayList<>();
        for(int i=0 ; i<Math.min(k,nums1.length); i++){
            pq.add(new info(i,0,nums1[i]+nums2[0]));
        }

        while(k>0 && !pq.isEmpty()){
            info curr = pq.remove();
            ans.add(new ArrayList<>(Arrays.asList(nums1[curr.p1], nums2[curr.p2])));

            if(curr.p2 +1 <nums2.length){
                pq.add(new info(curr.p1,curr.p2+1,nums1[curr.p1]+nums2[curr.p2+1]));
            }
            k--;
        }  
        return ans;
    }
}