class Solution {
    public int reverseDegree(String s) {

        HashMap<Character,Integer>map = new HashMap<>();
        char ch = 'a';

        for(int i=26 ; i>=1 ; i--){
            map.put(ch,i);
            ch++;
        }

        int sum = 0;
        for(int i=0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            int product = map.get(curr) * (i+1);
            sum += product;
        }
        return sum;
    }
}