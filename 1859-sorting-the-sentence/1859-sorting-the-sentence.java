class Solution {
    // public class info{
    //     int idx ;
    //     String s;

    //     public info(int idx,String s){
    //         this.idx = idx;
    //         this.s = s;
    //     }
    // }
    public String sortSentence(String s) {

        String a[] = s.split(" ");
        String[] b = new String[ a.length];

        for(String x : a){
            b[x.charAt(x.length()-1)-'1'] = x.substring(0,x.length()-1);
        }

        return String.join(" ",b);
        // int n= s.length();
        // StringBuilder sb = new StringBuilder();
        // PriorityQueue<info> pq = new PriorityQueue<>((a,b) -> a.idx - b.idx);
        // for(int i=0 ; i<n ; i++){
        //     char ch = s.charAt(i);
        //     if(Character.isWhitespace(ch)){
        //         continue;
        //     }

        //     if(Character.isDigit(ch)){
        //         pq.add(new info(ch-'0',sb.toString()));
        //         sb = new StringBuilder();
        //     }else{
        //         sb.append(ch);
        //     }
        // }
        // sb = new StringBuilder();

        // while(!pq.isEmpty()){
        //     sb.append(pq.remove().s);
        //     sb.append(" ");
        // }

        // sb.deleteCharAt(sb.length()-1);
        // return sb.toString();
    }
}