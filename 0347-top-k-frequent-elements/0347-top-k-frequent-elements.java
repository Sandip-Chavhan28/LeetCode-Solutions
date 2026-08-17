class Solution {
    public class info{
        int key ;
        int freq;

        public info(int key,int freq){
            this.key = key;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0 ; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<info>pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);

        for(int key : map.keySet()){
            pq.add(new info(key,map.get(key)));
        }
        int ans[] = new int[k];
        int index = 0;
        while(!pq.isEmpty()){
            if(index == k){
                break;
            }
            info curr = pq.remove();
            ans[index++] = curr.key;
        }
        return ans;
    }
}