class Solution {

    public static boolean DFS(ArrayList<Integer>[] graph, int source, int destination,boolean visit[]){
        if(source == destination) return true;
        visit[source] = true;
        
        for(int i=0 ; i<graph[source].size(); i++){
            if (!visit[graph[source].get(i)] && DFS(graph,graph[source].get(i),destination,visit)){
                return true;
            }
        }
        return false;
    } 
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer> [] graph = new ArrayList[n];

        for(int i=0 ; i< n ; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        return DFS(graph,source,destination,new boolean[n]);
    }
}