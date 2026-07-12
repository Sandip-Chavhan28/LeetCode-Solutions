class Solution {

    public boolean DFS(ArrayList<Integer>[] graph,int curr,boolean visit[],Stack<Integer>s,boolean recStack[]){
        visit[curr] = true;
        recStack[curr] = true;
        for(int i=0 ; i<graph[curr].size() ; i++){
            int neigh = graph[curr].get(i);
            if(recStack[neigh]){
                return true;
            }
            if(!visit[neigh]){
                if(DFS(graph,neigh,visit,s,recStack)){
                    return true;
                }
            }
        }
        recStack[curr] = false;
        s.add(curr);
        return false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        int ans[] = new int[numCourses];

        for(int i=0 ; i<numCourses ; i++){
            graph[i] = new ArrayList<>();
        }
        for(int edge[] : prerequisites){
            graph[edge[1]].add(edge[0]);
        }

        Stack<Integer>s = new Stack<>();
        boolean visit[] = new boolean[numCourses];
        boolean recStack[] = new boolean[numCourses];
        for(int i=0 ; i<numCourses ; i++){
            if(!visit[i]){
                if(DFS(graph,i,visit,s,recStack)){
                    return new int[0];
                }
            }
        }

        int idx = 0;
        while(!s.isEmpty()){
            ans[idx++] = (int) s.pop();
        }

        return ans;
    }
}