import java.util.*;

public class BellmanFordAlgo {

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
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));
        
        graph[1].add(new edge(1, 2, -4));
        
        graph[2].add(new edge(2, 3, 2));
        
        graph[3].add(new edge(3, 4, 4));
        
        graph[4].add(new edge(4, 1, -1));
    }

    public static void bellmanFordAlgo(ArrayList<edge> graph[],int so,int v){
        int dist[] = new int[v];
        for(int i=0;i<v;i++){
            if(i != so) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int k=0;k<v-1;k++){     // O(v)
            // O(E)
            for(int i=0;i<v;i++){
                for(int j =0;j<graph[i].size();j++) {
                    edge e = graph[i].get(j);
                    int U = e.so;
                    int V = e.des;

                    if(dist[U] != Integer.MAX_VALUE && dist[U] + e.wt < dist[V] ) {
                        dist[V] = dist[U] + e.wt;
                    }
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        bellmanFordAlgo(graph, 0, v);        

    }
}


