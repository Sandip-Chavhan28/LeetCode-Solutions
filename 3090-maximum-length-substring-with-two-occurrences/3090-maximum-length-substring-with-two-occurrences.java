class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int max = 0;
        int freq[] = new int[26];
        for(int i=0 ; i<s.length() ;i++){
            freq[s.charAt(i)-'a']++;
            while(freq[s.charAt(i)-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}