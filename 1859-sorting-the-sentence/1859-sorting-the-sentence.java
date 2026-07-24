class Solution {
    public class info{
        int idx ;
        String s;

        public info(int idx,String s){
            this.idx = idx;
            this.s = s;
        }
    }
    public String sortSentence(String s) {
        int n= s.length();
        StringBuilder sb = new StringBuilder();
        PriorityQueue<info> pq = new PriorityQueue<>((a,b) -> a.idx - b.idx);
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch)){
                continue;
            }

            if(Character.isDigit(ch)){
                pq.add(new info(ch-'0',sb.toString()));
                sb = new StringBuilder();
            }else{
                sb.append(ch);
            }
        }
        sb = new StringBuilder();

        while(!pq.isEmpty()){
            sb.append(pq.remove().s);
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}