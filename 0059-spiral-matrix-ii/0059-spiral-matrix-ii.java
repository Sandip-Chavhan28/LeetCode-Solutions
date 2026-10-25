class Solution {
    public int[][] generateMatrix(int n) {
        int startrow = 0 ;
        int endrow = n-1 ;
        int startcol = 0;
        int endcol = n-1;

        int[][] temp = new int[n][n];
        int[][] ans = new int[n][n];
        int start = 1;

        while(startrow <= endrow && startcol <= endcol){

            for(int j=startcol ; j<= endcol ; j++){
                temp[startrow][j] = start++ ;
            }
            for(int i = startrow+1 ; i<=endrow ; i++){
                temp[i][endcol] = start++;
            }


            if(startcol != endcol){
                for(int j=endcol-1 ; j>=startcol && startrow < endrow ; j--){
                    temp[endrow][j] = start++;
                }
            }

            for(int i=endrow-1 ; i>=startrow+1 && startcol < endcol ; i--){
                temp[i][startcol] = start++;
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n; j++){
                ans[i][j] = temp[i][j];
            }
        }
        return ans;
    }
}