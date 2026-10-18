class Solution {

    public int mPS(int grid[][],int i,int j,int dp[][]){
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE / 2;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }

        int down = grid[i][j] + mPS(grid,i+1,j,dp);
        int right = grid[i][j] + mPS(grid,i,j+1,dp);

        dp[i][j] = Math.min(down,right);
        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int n =grid.length;
        int m =grid[0].length;

        int dp[][] = new int[n+1][m+1];

        for(int i=0 ; i<n+1; i++){
            Arrays.fill(dp[i],-1);
        }

        return mPS(grid,0,0,dp);

        // dp[0][0] = 1;

        // for(int i=1 ; i<n+1; i++){
        //     for(int j=1 ; j<m+1; j++){
        //         int down = Integer.MAX_VALUE;
        //         if(i>1){
        //             down = grid[i-1][j-1] + dp[i-2][j-1];
        //         }
        //         int right = Integer.MAX_VALUE;
        //         if(j>1){
        //             right = grid[i-1][j-1] + dp[i-1][j-2];
        //         }

        //         dp[i][j] = Math.min(down,right);
        //     }
        // }
        // return dp[n][m];
    }
}