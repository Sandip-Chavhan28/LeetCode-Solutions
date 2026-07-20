class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] temp = new int[n][m];
        while(k>0){
            temp[0][0] = grid[n-1][m-1];
            for(int j=0 ;j<m ;j++){
                for(int i=0 ; i<n ;i++){
                    if((j+1) < m){
                        temp[i][j+1] = grid[i][j];
                    }
                }
            }

            for(int i=0 ; i<n ;i++){
                if(i+1 < n){
                    temp[i+1][0] = grid[i][m-1];
                }
            }
            k--;
            grid = temp;
            temp = new int[n][m];
        }

        List<List<Integer>> final_list = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            List<Integer>list = new ArrayList<>();
            for(int j=0 ; j<m ;j++){
                list.add(grid[i][j]);
            }
            final_list.add(list);
        }
        return final_list;
    }
}