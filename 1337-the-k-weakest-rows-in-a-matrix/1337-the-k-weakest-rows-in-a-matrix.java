class Solution {
    public class info implements Comparable<info>{
        int row ;
        int soldier;

        public info(int row , int soldier){
            this.row = row;
            this.soldier = soldier;
        }

        @Override
        public int compareTo(info other){
            if(this.soldier == other.soldier){
            return this.row - other.row;
        }
            return this.soldier - other.soldier;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        PriorityQueue<info>pq = new PriorityQueue<>();
        for(int i=0 ; i<n ; i++){
            int solcount = 0;
            for(int j=0; j<m ;j++){
                if(mat[i][j] == 0){
                    break;
                }
                solcount++;
            }
            pq.add(new info(i,solcount));
        }
        int ans[] = new int[k];
        int i=0;
        while(i<k){
            ans[i++] = pq.remove().row;
        }
        return ans;
    }
}