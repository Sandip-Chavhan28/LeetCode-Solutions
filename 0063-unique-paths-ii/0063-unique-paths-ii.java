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
        // for(int i=0 ; i<n; i++){
        //     Arrays.fill(dp[i],-1);
        // }

        // return upwo(0,0,obstacleGrid,dp,n,m);

        dp[1][1] = obstacleGrid[0][0] == 1 ? 0:1;
        for(int i=1 ; i<n+1 ; i++){
            for(int j=1 ; j< m+1 ; j++){

                if(i== 1 && j == 1){
                    continue;
                }
                if(obstacleGrid[i-1][j-1] == 1){
                    dp[i][j] = 0;
                }else{
                    int down = dp[i-1][j];
                    int right = dp[i][j-1];

                    dp[i][j] = down + right;
                }
            }
        }
        return dp[n][m];
    }
}