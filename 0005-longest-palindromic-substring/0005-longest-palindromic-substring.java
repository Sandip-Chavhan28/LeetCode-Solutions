class Solution {
    public boolean checkpalindrome(int si , int ei ,String s){
        while(si<ei){
            if(s.charAt(si) != s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        int maxlen = 0;
        for(int i=0 ; i<s.length(); i++){
            for(int j=i ; j<s.length() ; j++){
                if(maxlen > (j-i+1)){
                    continue;
                }else{
                    if(checkpalindrome(i,j,s)){
                        ans = s.substring(i,j+1);
                        maxlen = j-i+1;
                    }
                }
            }
        }
        return ans;
    }
}