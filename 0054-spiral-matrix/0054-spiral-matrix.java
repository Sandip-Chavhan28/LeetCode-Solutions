class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow = 0 ;
        int startcol = 0 ;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();
        while(startrow <= endrow && startcol <= endcol){
            for(int j= startcol; j<=endcol ; j++){
                list.add(matrix[startrow][j]);
            }
            for(int i=startrow+1 ; i<= endrow ; i++){
                list.add(matrix[i][endcol]);
            }
            if (startrow < endrow) {
                for(int j =endcol-1; j>=startcol ; j--){
                list.add(matrix[endrow][j]);
                }
            }
            if(startcol < endcol){
                for(int i=endrow-1; i>startrow ; i--){
                list.add(matrix[i][startcol]);
                }
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return list;
    }
}