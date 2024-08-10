import java.util.*;

public class TopologySorting {
    
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

            graph[2].add(new edge(2,3));
            
            graph[3].add(new edge(3,1));

            
            graph[4].add(new edge(4,0));
            graph[4 ].add(new edge(4,1));

            
            graph[5].add(new edge(5,0));
            graph[5].add(new edge(5,2));
        }

        public static void topSortUtil(ArrayList<edge> graph[],int curr,boolean vis[],Stack<Integer> stack){
            vis[curr] = true;

            for(int i=0;i<graph[curr].size();i++){
                edge e = graph[curr].get(i);
                if(!vis[e.des]) {
                    topSortUtil(graph, e.des, vis, stack);  
                }
            }
            stack.push(curr);
        }

        public static void topSort(ArrayList<edge> garph[],int v){
            boolean vis[]  = new boolean[v];
            Stack<Integer> stack = new Stack<>();

            for(int i=0;i<v;i++){
                if(!vis[i]){
                    topSortUtil(garph, i, vis, stack);
                }
            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop()+"  ");
            }
        }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        topSort(graph, v);

    }

}



