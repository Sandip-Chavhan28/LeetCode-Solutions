class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        for(int i=0 ; i<word.length() ; i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int flag = 1;
        int count = 0;
        int cost = 0;
        for(int i=25 ; i>=0 ; i--){
            if(freq[i] == 0){
                continue;
            }
            cost += freq[i] * flag;
            count++;
            if(count == 8){
                count = 0;
                flag++;
            }
        }
        return cost;
    }
}