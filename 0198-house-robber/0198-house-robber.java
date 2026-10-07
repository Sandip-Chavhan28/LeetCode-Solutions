class Solution {

    // public int rB(int[] nums,int n,int dp[]){
    //     if(n <= 0){
    //         return 0;
    //     }

    //     if(dp[n] != -1){
    //         return dp[n];
    //     }

    //     int take = nums[n-1] + rB(nums,n-2,dp);
    //     int no_take = rB(nums,n-1,dp);

    //     dp[n] = Math.max(take,no_take);
    //     return dp[n];
    // }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        // Arrays.fill(dp,-1);

        // return rB(nums,n,dp);

        dp[0] = 0;

        for(int i=1; i<n+1 ; i++){
            int take = nums[i-1] ;
            if(i > 1){
                take += dp[i-2];
            }
            int no_take = dp[i-1];

            dp[i] = Math.max(take,no_take);
        }
        return dp[n];
    }
}