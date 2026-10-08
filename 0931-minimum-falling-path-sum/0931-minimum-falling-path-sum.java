class Solution {

    public int mfps(int i,int j ,int matrix[][],int dp[][]){
        if(i==matrix.length-1){
            return matrix[i][j];
        }
        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
        }
        int left = Integer.MAX_VALUE;
        if(j>0){
            left = matrix[i][j] + mfps(i+1,j-1,matrix,dp);
        }
        int right= Integer.MAX_VALUE;
        if(j<matrix[0].length-1){
            right = matrix[i][j] + mfps(i+1,j+1,matrix,dp);
        }
        int down =matrix[i][j] + mfps(i+1,j,matrix,dp);

        dp[i][j] = Math.min(left,Math.min(right,down));
        return dp[i][j];
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int dp[][] = new int[n+1][m+1];
        for(int j=0 ; j<n+1 ;j++){
            Arrays.fill(dp[j],Integer.MAX_VALUE);
        }

        int mincost = Integer.MAX_VALUE;

        for(int i=0 ; i<m; i++){
            mincost = Math.min(mincost , mfps(0,i,matrix,dp));
        }

        return mincost;
    }
}