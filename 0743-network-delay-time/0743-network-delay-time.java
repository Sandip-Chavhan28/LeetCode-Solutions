class Solution {
    public class Edge{
        int src;
        int des;
        int wt;

        public Edge(int src,int des,int wt){
            this.src = src;
            this.des = des;
            this.wt= wt;
        }
    }

    public class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n,int path){
            this.n = n ;
            this.path = path;
        }

        @Override
        public int compareTo(Pair other){
            return this.path-other.path;
        }
    }

    public void main_code(ArrayList<Edge>[] graph,int src,int dist[]){
        for(int i=0 ;i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean visit[] = new boolean[dist.length+1];
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visit[curr.n]){
                visit[curr.n] = true;
                for(int i=0; i<graph[curr.n].size(); i++){
                    Edge e= graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.des;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge>[] graph= new ArrayList[n+1];

        for(int i=0 ; i<= n ;i++){
            graph[i] = new ArrayList<>();
        }
        for(int edge[] : times){
            graph[edge[0]].add(new Edge(edge[0],edge[1],edge[2]));
        }

        int ans[] = new int[n+1];
        main_code(graph,k,ans);
        
        int max = 0;
        for(int i=1 ; i<=n ; i++){
            if(ans[i] == Integer.MAX_VALUE){
                return -1;
            }
            max = Math.max(ans[i],max);
        }
        return max;
    }
}