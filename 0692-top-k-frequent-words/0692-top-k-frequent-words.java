class Solution {
    public class info implements Comparable<info> {
        String s;
        int freq;

        public info(String s,int freq){
            this.s = s;
            this.freq = freq;
        }

        @Override
        public int compareTo(info other){
            if(this.freq == other.freq){
                return this.s.compareTo(other.s);
            }else{
                return other.freq-this.freq;
            }
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String>list = new ArrayList<>();
        for(int i=0 ; i<words.length; i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<info>pq = new PriorityQueue<>();

        for(String key : map.keySet()){
            pq.add(new info(key,map.get(key)));
        }

        for(int i=0; i<k; i++){
            info curr = pq.remove();
            list.add(curr.s);
        }
        return list;
    }
}