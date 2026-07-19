class Solution {
    // public int climbStairs(int n) {
    //     if(n == 1)  return 1;
    //     int dp[] = new int[n+1];
    //     dp[0] = 1 ; // this is a also one way not zero ways
    //     dp[1] = 1 ;
    //     for(int i=2 ; i<n+1 ; i++){
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    // }

    public int cal_climb(int n,int dp[]){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = cal_climb(n-1,dp) + cal_climb(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n){
       return  cal_climb(n,new int[n+1]);
    }
}