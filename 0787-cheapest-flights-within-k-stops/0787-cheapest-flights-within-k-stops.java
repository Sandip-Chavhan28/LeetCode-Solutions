class Solution {

    public class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.des = d;
            this.wt =w;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dist[] = new int[n];

        for(int i=0 ; i<dist.length ; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i <= k; i++) {
            int[] temp = dist.clone();
            for (int[] flight : flights) {

                int u = flight[0];
                int v = flight[1];
                int wt = flight[2];

                if (dist[u] != Integer.MAX_VALUE &&
                    dist[u] + wt < temp[v]) {

                    temp[v] = dist[u] + wt;
                }
            }

            dist = temp;
        }
        
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}