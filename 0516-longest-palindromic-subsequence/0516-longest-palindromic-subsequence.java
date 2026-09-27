class Solution {

    public int lps(String s,String reverse,int i,int j,int dp[][]){
        if(i == s.length() || j == s.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s.charAt(i) == reverse.charAt(j)){
            dp[i][j] = 1 + lps(s,reverse,i+1,j+1,dp);
        }else{
            int rs = lps(s,reverse,i+1,j,dp);
            int rreverse = lps(s,reverse,i,j+1,dp);

            dp[i][j] = Math.max(rs,rreverse);
        }
        return dp[i][j];
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        for(int i=0 ; i<n+1 ; i++){
            Arrays.fill(dp[i],-1);
        }
        String reverse = new StringBuilder(s).reverse().toString();
        return lps(s,reverse,0,0,dp);
    }
}