class Solution {

    public int upwo(int i,int j,int[][] obstacleGrid,int dp[][],int n,int m){

        if(i >= n || j>= m){
            return 0;
        }

        if(obstacleGrid[i][j] == 1){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int down = upwo(i+1,j,obstacleGrid,dp,n,m);
        int right = upwo(i,j+1,obstacleGrid,dp,n,m);

        dp[i][j] = down + right;
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int dp[][] = new int[n+1][m+1];
        for(int i=0 ; i<n; i++){
            Arrays.fill(dp[i],-1);
        }

        return upwo(0,0,obstacleGrid,dp,n,m);
    }
}