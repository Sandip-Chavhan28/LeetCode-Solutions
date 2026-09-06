class Solution {
    public int generatesubsequence(String s,String t,int i,int j,int dp[][]){
        if(j == t.length()){
            return 1;
        }
        if(i >= s.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s.charAt(i) == t.charAt(j)){
            int take = generatesubsequence(s,t,i+1,j+1,dp);
            int non_take = generatesubsequence(s,t,i+1,j,dp);

            dp[i][j] = take + non_take;
        }else{
            dp[i][j] = generatesubsequence(s,t,i+1,j,dp);
        }  

        return dp[i][j]; 
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0 ; i<n+1; i++){
            for(int j=0 ; j<m+1 ;j++){
                dp[i][j] = -1;
            }
        }

        return generatesubsequence(s,t,0,0,dp);
    }
}