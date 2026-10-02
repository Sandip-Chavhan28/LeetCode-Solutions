class Solution {

    public int cS(int i,int costs[],int dp[],int n){
        if(i == n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int one = Integer.MAX_VALUE;
        if(i+1 <= n){
            one = costs[i] + 1 + cS(i+1,costs,dp,n);
        }
        int two = Integer.MAX_VALUE;
        if((i+2) <= n){
            two = costs[i+1] + 4 + cS(i+2,costs,dp,n);
        }
        int three = Integer.MAX_VALUE;
        if((i+3) <= n){
            three = costs[i+2] + 9 + cS(i+3,costs,dp,n);
        }
        dp[i] = Math.min(one,Math.min(two,three));
        return dp[i];
    }
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return cS(0,costs,dp,n);
    }
}