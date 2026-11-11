class Solution {

    // public long mC(int cost1,int cost2,int costBoth,int i,int j, int need1, int need2,long dp[][]){
    //     if((i>= need1 && j>= need2)){
    //         return 0;
    //     }

    //     if(dp[i][j] != -1){
    //         return dp[i][j];
    //     }

    //     long sum1 = Long.MAX_VALUE/2;
    //     long sum2 = Long.MAX_VALUE/2;
    //     long sum3 = Long.MAX_VALUE/2;

    //     if(i<need1){
    //         sum1= cost1 + mC(cost1,cost2,costBoth,i+1,j,need1,need2,dp);
    //     }

    //     if(j<need2){
    //         sum2= cost2+ mC(cost1,cost2,costBoth,i,j+1,need1,need2,dp);
    //     }

    //     if(i<need1 || j<need2){
    //         sum3= costBoth + mC(cost1,cost2,costBoth,Math.min(i+1,need1),Math.min(j+1,need2),need1,need2,dp);
    //     }

    //     dp[i][j] = Math.min(sum1,Math.min(sum2,sum3));

    //     return dp[i][j];
    // }
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        // long dp[][] = new long[need1+1][need2+1];

        // for(int i=0 ; i<need1+1 ; i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // long ans = mC(cost1,cost2,costBoth,0,0,need1,need2,dp);
        // return ans;

        long both = Math.min(need1,need2);
        long ans = both * Math.min(costBoth,cost1+cost2);

        long remaining1 = Math.max(0,need1-need2);
        long remaining2 = Math.max(0,need2-need1);

        ans += remaining1 * Math.min(cost1,costBoth);
        ans += remaining2 * Math.min(cost2,costBoth);

        return ans;
    }
}