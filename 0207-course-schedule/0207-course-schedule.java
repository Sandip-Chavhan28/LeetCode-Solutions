class Solution {

    public boolean DFS(ArrayList<Integer>[] graph,int curr,boolean visit[],boolean reccurr[]){
        visit[curr] = true;
        reccurr[curr] = true;
        for(int neigh : graph[curr]){
            if(reccurr[neigh]){
                return true;
            }
            if(!visit[neigh]){
                if(DFS(graph,neigh,visit,reccurr)){
                    return true;
                }
            }
        }
        reccurr[curr] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for(int i=0 ; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int edge[] : prerequisites){
            graph[edge[1]].add(edge[0]);
        }

        boolean visit[] = new boolean[numCourses];
        for(int i=0 ; i<graph.length; i++){
            if(!visit[i]){
                if(DFS(graph,i,visit,new boolean[numCourses])){
                    return false;
                }
            }
        }
        return true;
    }
}