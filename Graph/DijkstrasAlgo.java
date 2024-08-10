import java.util.*;

public class DijkstrasAlgo {

    static class edge {
        int so;
        int des;
        int wt;

        public edge (int s,int d,int w){
            this.so = s;
            this.des = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1,2));
        graph[0].add(new edge(0,2,4));

        graph[1].add(new edge(1,3,7));
        graph[1].add(new edge(1,2,1));
        
        graph[2].add(new edge(2,4,3));
        
        graph[3].add(new edge(3,5,1));
        
        graph[4].add(new edge(4,3,2));
        graph[4].add(new edge(4,5,5));
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair (int n,int d){
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist; //accending order 
            // return p2.dist - this.dist; //decending order
        }
    }

    public static int[] dijkstrasAlgorithm(ArrayList<edge> graph[],int so){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i != so){
                dist[i] = Integer.MAX_VALUE;
            } 
        }
        boolean vis[] = new boolean[graph.length];

        pq.add(new Pair(so, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove(); //shortest
            if(!vis[curr.node]) {
                vis[curr.node] = true;

                for(int i=0;i<graph[curr.node].size();i++){
                    edge e = graph[curr.node].get(i);
                    int U = e.so;
                    int V = e.des;
                    if(dist[U] + e.wt < dist[V]) { //relaxation
                        dist[V] = dist[U] + e.wt;
                        dist[V] = dist[U] + e.wt;
                        pq.add(new Pair(V,dist[V]));
                    }
                }
            }
        }

    return dist;
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        int so=0;

        int dist[] = dijkstrasAlgorithm(graph, so);
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i] + "  ");
        }
    }
}





// result will be sortedt path 
