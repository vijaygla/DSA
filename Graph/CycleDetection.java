import java.util.*;

public class CycleDetection {

    static class edge{
        int so;
        int des;

        public edge (int s,int d){
            this.so=s;
            this.des=d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1,0));
        graph[2].add(new edge(2,3));
        graph[3].add(new edge(3,0));
    }

    public static boolean isCycleDirected(ArrayList<edge> graph[],boolean vis[],int curr,boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(rec[e.des]){
                return true;
            }
            else if (!vis[e.des]) {
                if(isCycleDirected(graph, vis, e.des, rec)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];
        boolean rec[] = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                boolean isCycle  = isCycleDirected(graph, vis,0, rec);
                System.out.println(isCycle);
                break;
            }
        }
    }
}


// Output : true - means cycle detection are in graph otherwise Not