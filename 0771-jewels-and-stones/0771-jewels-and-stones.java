class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int freq[] = new int[52];
        int freq2[] = new int[52];

        for(int i=0 ; i<jewels.length(); i++){
            char ch = jewels.charAt(i);

            if(Character.isLowerCase(ch)){
                freq[ch-'a']++;
            }else{
                freq[ch-'A'+26]++;
            }
        }

        for(int i=0 ; i<stones.length(); i++){
            char ch = stones.charAt(i);

            if(Character.isLowerCase(ch)){
                freq2[ch-'a']++;
            }else{
                freq2[ch-'A'+26]++;
            }
        }
        int count = 0;
        for(int i=0 ; i<52 ; i++){
            if(freq[i]>=1){
                count += freq2[i];
            }
        }
        return count;
    }
}