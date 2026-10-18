class Solution {

    public int cP(int nums[],int i,int target,int dp[][]){
        if(target == 0){
            return 1;
        }
        if(i >= nums.length || target < 0){
            return 0;
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }

        int take = cP(nums,i+1,target-nums[i],dp);
        int no_take = cP(nums,i+1,target,dp);

        dp[i][target] = (take == 0 && no_take == 0) ? 0 : 1;
        return dp[i][target];
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0 ;
        for(int i=0 ; i<n; i++){
            sum += nums[i];
        }

        if(sum %2 != 0){
            return false;
        }

        int target = sum/2;
        int dp[][] = new int[n+1][target+1];


        for(int i=0 ; i<n+1 ; i++){
            Arrays.fill(dp[i],-1);
        }

        if(cP(nums,0,target,dp) == 1){
            return true;
        }
        return false;
    }
}