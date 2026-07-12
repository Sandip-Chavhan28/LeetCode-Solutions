class Solution {

    public void All_path(int[][] graph,List<Integer>list,List<List<Integer>>finallist,int curr){
        list.add(curr);
        if(curr == graph.length-1)
        {
            finallist.add(new ArrayList<>(list));
            return;
        }

        for(int i=0 ; i<graph[curr].length; i++){
            int neigh = graph[curr][i];
            All_path(graph,list,finallist,neigh);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>finallist = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        All_path(graph,list,finallist,0);
        return finallist;
    }
}