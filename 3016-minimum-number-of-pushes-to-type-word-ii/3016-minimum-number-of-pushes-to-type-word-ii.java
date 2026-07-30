class Solution {
    public class info{
        char ch ;
        int freq;

        public info(char ch,int freq){
            this.ch = ch;
            this.freq = freq;
        }
    }
    public int minimumPushes(String word) {
        PriorityQueue<info> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);
        int freq[] = new int[26];
        for(int i=0 ; i<word.length() ; i++){
            freq[word.charAt(i)-'a']++;
        }
        for(int i=0 ; i<26 ;i++){
            if(freq[i] > 0){
                pq.add(new info((char)(i+'a'),freq[i]));
            }
        }
        int flag = 1;
        int count = 0;
        int cost = 0;
        while(!pq.isEmpty()){
            info curr = pq.remove();
            cost += curr.freq * flag;
            count++;
            if(count == 8){
                count = 0;
                flag++;
            }
        }
        return cost;
    }
}