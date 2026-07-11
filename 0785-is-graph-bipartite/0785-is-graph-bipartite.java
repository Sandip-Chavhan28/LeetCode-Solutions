class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int visit[] = new int[n];
        Arrays.fill(visit, -1);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (visit[i] == -1) {
                visit[i] = 0;
                q.add(i);
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j=0 ; j<graph[curr].length; j++){
                        int neigh = graph[curr][j];
                        if(visit[neigh] == -1){
                            int nextcol = visit[curr] == 0 ? 1 : 0;
                            visit[neigh] = nextcol;
                            q.add(neigh);
                        }else if(visit[neigh] == visit[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}