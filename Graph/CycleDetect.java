import java.util.*;

public class CycleDetect {

    static class edge {
        int so;
        int des;

        public edge (int s,int d){
            this.so = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 4));
        
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 4));
        
        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));
        
        graph[3].add(new edge(3, 2));
        
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        graph[4].add(new edge(4, 5));
        
        graph[5].add(new edge(5, 4));
    }

    public static boolean isCycleUndirected(ArrayList<edge> graph[],boolean vis[],int curr,int parent){
        vis[curr] = true;
        // par --> parent
        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(vis[e.des] && e.des != parent){
                return true;
            }
            else if(!vis[e.des]) {
                if(isCycleUndirected(graph, vis,e.des, parent)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        System.out.println(isCycleUndirected(graph, new boolean[v], 0, -1));

    }
}




// true means cycle is detected and false means cycle is not found

