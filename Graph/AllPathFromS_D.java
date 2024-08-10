import java.util.*;

public class AllPathFromS_D {
    
    static class edge {
        int sc;
        int des;
        public edge (int s,int d){
            this.sc = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));
        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));
        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));
        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));
        graph[6].add(new edge(6, 5));

    }

    public static void dfs(ArrayList<edge> graph[],int curr,boolean visited[]){
        System.out.println();
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(visited[e.des] == false){
                dfs(graph, e.des, visited);
            }
        }
    }

    public static void printAllPath(ArrayList<edge> graph[],boolean visited[],int curr,String path,int target){
        if(curr == target){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!visited[e.des]){
                visited[curr] = true;
                printAllPath(graph, visited, e.des, path+e.des, target);
                visited[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        int start = 0;int target = 5;

        createGraph(graph);

        printAllPath(graph, new boolean[v], start,"0",target);

    }

}



