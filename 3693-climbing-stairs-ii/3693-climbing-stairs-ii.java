class Solution {

    public int cS(int n,int costs[],int dp[]){
        if(n == 0){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int one = cS(n-1,costs,dp) + costs[n-1] + 1;

        int two = Integer.MAX_VALUE;
        if(n > 1){
            two = cS(n-2,costs,dp) + costs[n-1] + 4;
        }

        int three = Integer.MAX_VALUE;
        if(n>2){
            three = cS(n-3,costs,dp) + costs[n-1] + 9;
        }

        dp[n] = Math.min(one , Math.min(two,three));
        return dp[n];
        
    }
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return cS(n,costs,dp);

        // int dp1=0,dp2=0,dp3=0;
        // for(int i=1;i<=n;i++){
        //     int cur=Math.min(dp3+1,Math.min(dp2+4,dp1+9))+costs[i-1];
        //     dp1=dp2;
        //     dp2=dp3;
        //     dp3=cur;
        // }
        // return dp3;
    }
}